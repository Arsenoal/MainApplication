package com.example.mainapplication

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.networkproperties.generalparams.DynamicHeadersProvider
import com.example.networkproperties.generalparams.Headers
import com.example.networkproperties.generalparams.RestApiParams
import com.example.networkproperties.servicie.sample.SampleService
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    fun performRequest() {
        viewModelScope.launch {
            val response = RestClientProvider.retrofit(RestApiParams(baseUrl = "http://api.plos.org/", headers = Headers(
                object: DynamicHeadersProvider {
                    override fun headers(): Map<String, String> {
                        return mapOf()
                    }
                }
            ))).create(SampleService::class.java).getData("http://api.plos.org/search?q=title:DNA")

            Log.d(MainViewModel::class.java.simpleName, "response: \n\n\n $response")
        }
    }
}