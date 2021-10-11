package com.sean.kmmpulse.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sean.kmmpulse.Greeting
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.sean.kmmpulse.KMPulseInitialization
import com.sean.kmmpulse.domain.use_case.get_coins.GetCoinsUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        KMPulseInitialization.initialization()
    }

    override fun onResume() {
        super.onResume()
        val use_case = GetCoinsUseCase()
        lifecycleScope.launch {
            // Call use case and collect on the use case and print out each result of that use case
            use_case().collect {
                println(it)
            }
        }
    }
}
