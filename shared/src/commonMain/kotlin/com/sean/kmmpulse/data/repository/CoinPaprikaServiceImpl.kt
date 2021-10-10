package com.sean.kmmpulse.data.repository

import com.sean.kmmpulse.data.model.Coin
import com.sean.kmmpulse.data.model.CoinDetail
import com.sean.kmmpulse.data.remote.CoinPaprikaService
import com.sean.kmmpulse.data.remote.HttpRoutes
import io.ktor.client.*
import io.ktor.client.request.*

class CoinPaprikaServiceImpl(
    private val client: HttpClient
) : CoinPaprikaService {

    override suspend fun getCoins(): List<Coin> {
        return try {
            client.get { url(HttpRoutes.COINS) }
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