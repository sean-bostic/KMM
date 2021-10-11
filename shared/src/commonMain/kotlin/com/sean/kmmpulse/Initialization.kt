package com.sean.kmmpulse

import com.sean.kmmpulse.data.repository.CoinRepositoryImpl
import com.sean.kmmpulse.domain.repository.CoinRepository
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import org.koin.core.context.startKoin
import org.koin.dsl.module

object KMPulseInitialization {
    fun initialization(){
        startKoin {
            // declare used modules
            modules(module {
                single<CoinRepository> {
                    CoinRepositoryImpl(client = HttpClient(){
                        install(JsonFeature) {
                            serializer = KotlinxSerializer()
                        }
                    })
                }
            })
        }
    }
}