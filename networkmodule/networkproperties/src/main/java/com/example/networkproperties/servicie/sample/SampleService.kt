package com.example.networkproperties.servicie.sample

import retrofit2.http.GET
import retrofit2.http.Url

interface SampleService {
    @GET
    suspend fun getData(@Url url: String): SampleResponse
}