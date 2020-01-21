package com.example.mainapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.networkproperties.generalparams.DynamicHeadersProvider
import com.example.networkproperties.generalparams.Headers
import com.example.networkproperties.generalparams.RestApiParams
import com.example.networkproperties.servicie.sample.SampleService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext
import kotlin.coroutines.suspendCoroutine

class MainActivity : AppCompatActivity() {

    private val mainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        performRequetButton.setOnClickListener {
            mainViewModel.performRequest()
        }
    }
}
