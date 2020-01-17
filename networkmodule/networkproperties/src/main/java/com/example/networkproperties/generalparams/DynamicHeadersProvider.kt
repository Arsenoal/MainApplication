package com.example.networkproperties.generalparams

interface DynamicHeadersProvider {
    fun headers(): Map<String, String>
}