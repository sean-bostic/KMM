package com.sean.kmmpulse.domain.use_case.get_coins

import android.util.Log
import com.sean.kmmpulse.common.Resource
import com.sean.kmmpulse.domain.model.Coin
import com.sean.kmmpulse.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetCoinsUseCase() : KoinComponent  {
    // TODO KOIN INJECTION HERE
    private val repository : CoinRepository by inject() // only Android

    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins()
            emit(Resource.Success<List<Coin>>(coins))
        }  catch(e: Exception) {
            println(e)
            emit(Resource.Error<List<Coin>>("Couldn't reach server. Check your internet connection."))
        }
        // Log.d("MainActivity", "We are executing the CoinUseCase flow in ${Thread.currentThread().name} THREAD")
    }
}
