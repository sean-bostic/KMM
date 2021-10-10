package com.sean.kmmpulse.domain.use_case.get_coin

import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetCoinUseCase
// TODO Add Koin Dependency Injection here
//{
//    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
//        try {
//            emit(Resource.Loading<CoinDetail>())
//            val coin = repository.getCoinById(coinId).toCoinDetail()
//            emit(Resource.Success<CoinDetail>(coin))
//        } catch(e: HttpException) {
//            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occured"))
//        } catch(e: IOException) {
//            emit(Resource.Error<CoinDetail>("Couldn't reach server. Check your internet connection."))
//        }
//        Log.d("MainActivity", "We are executing the CoinUseCase flow in ${Thread.currentThread().name} THREAD")
//    }
//}