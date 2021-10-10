package com.sean.kmmpulse.domain.repository

import com.sean.kmmpulse.domain.model.Coin

interface CoinRepository {

    suspend fun getCoins(): List<Coin>
}