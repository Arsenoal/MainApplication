package com.example.networkproperties.servicie.sample

import com.google.gson.annotations.SerializedName

data class SampleResponse(
    @SerializedName("response") val response: Response
)

data class Response(@SerializedName("numFound") val numFound: Int)