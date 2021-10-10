package com.sean.kmmpulse.domain.use_case.get_coins

import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetCoinsUseCase {
    // TODO KOIN INJECTION HERE

//    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
//        try {
//            emit(Resource.Loading<List<Coin>>())
//            val coins = repository.getCoins().map { it.toCoin() }
//            emit(Resource.Success<List<Coin>>(coins))
//        } catch(e: HttpException) {
//            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occured"))
//        } catch(e: IOException) {
//            emit(Resource.Error<List<Coin>>("Couldn't reach server. Check your internet connection."))
//        }
//        Log.d("MainActivity", "We are executing the CoinUseCase flow in ${Thread.currentThread().name} THREAD")
//    }
//}
}