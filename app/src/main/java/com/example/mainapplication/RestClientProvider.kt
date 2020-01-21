package com.example.mainapplication

import com.example.networkproperties.generalparams.RestApiParams
import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestClientProvider {

    private var gson: Gson? = null

    private fun gson(): Gson {
        return Gson()
    }

    private fun gsonCallAdapterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create(gson())
    }

    fun retrofit(restApiParams: RestApiParams): Retrofit {
        return Retrofit.Builder()
            .baseUrl(restApiParams.baseUrl)
            .addConverterFactory(gsonCallAdapterFactory())
            .build()
    }
}