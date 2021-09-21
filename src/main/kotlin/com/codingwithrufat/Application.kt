package com.codingwithrufat

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.codingwithrufat.plugins.*

fun main() {
    embeddedServer(Netty, port = 8100, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
        configureMonitoring()
    }.start(wait = true)
}
