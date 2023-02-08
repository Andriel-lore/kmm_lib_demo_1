package com.andriel.kmmlin2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform