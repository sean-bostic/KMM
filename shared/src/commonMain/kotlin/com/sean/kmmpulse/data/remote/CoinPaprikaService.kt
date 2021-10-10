package com.sean.kmmpulse.data.remote

import com.sean.kmmpulse.data.model.Coin
import com.sean.kmmpulse.data.model.CoinDetail

interface CoinPaprikaService {

    suspend fun getCoins(): List<Coin>

//    suspend fun getCoinById(coindId : String): CoinDetail
}