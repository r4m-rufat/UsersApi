package com.codingwithrufat.plugins

import com.codingwithrufat.routes.users
import io.ktor.routing.*
import io.ktor.http.content.*
import io.ktor.application.*

fun Application.configureRouting() {
    routing {
        users()
    }
}
