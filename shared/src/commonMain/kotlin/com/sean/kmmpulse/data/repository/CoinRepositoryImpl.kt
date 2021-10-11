package com.sean.kmmpulse.data.repository

import com.sean.kmmpulse.data.remote.HttpRoutes
import com.sean.kmmpulse.data.remote.dto.CoinDto
import com.sean.kmmpulse.data.remote.dto.toCoin
import com.sean.kmmpulse.domain.model.Coin
import com.sean.kmmpulse.domain.repository.CoinRepository
import io.ktor.client.*
import io.ktor.client.request.*

class CoinRepositoryImpl(
    private val client: HttpClient
) : CoinRepository {

    override suspend fun getCoins(): List<Coin> {
        return try {
            val apiCoins : List<CoinDto> = client.get { url(HttpRoutes.COINS) }
            apiCoins.map{it.toCoin()}
        } catch (e: Exception) {
            print("ERROR: ${e.message}")
            emptyList<Coin>()
        }
    }

//    override suspend fun getCoinById(coinId): CoinDetail {
//        return try {
//            client.get { url(HttpRoutes.COINS) }
//        } catch (e: Exception) {
//            print("ERROR: ${e.message}")
//            emptyList<Coin>()
//        }
//    }
}