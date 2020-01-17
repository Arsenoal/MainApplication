package com.example.networkproperties.generalparams

import java.util.concurrent.ConcurrentHashMap

class Headers(private val dynamicHeadersProvider: DynamicHeadersProvider) {
    var headers: Map<String, String> = ConcurrentHashMap<String, String>().apply {
        put("User-Agent", "PicsArt-10.x")
        put("platform", "android")
        put("Accept", "application/picsart-3.0+json")
        dynamicHeadersProvider.headers().forEach {
            put(it.key, it.value)
        }
    }
}