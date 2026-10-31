package com.sudhirtheindiansp.weatherapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform