package com.example.kmpjetbrains

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform