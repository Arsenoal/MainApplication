package com.example.networkproperties.servicie.sample

import retrofit2.http.Url

interface SampleService {
    suspend fun getData(@Url url: String): SampleResponse
}