package com.example.networkproperties.servicie.sample

import com.google.gson.annotations.SerializedName

data class SampleResponse(
    @SerializedName("response") val response: String
)