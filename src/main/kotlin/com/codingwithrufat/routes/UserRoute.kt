package com.codingwithrufat.routes

import com.codingwithrufat.model.User
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private val users = listOf(
    User(1, "Rufat", "Nasirov", "Android Developer"),
    User(2, "Ulvi", "Nasirov", "Mobile Developer"),
    User(3,"Ilkin", "Aslanli", "React Developer"),
    User(4,"Durkhan", "Adilov", "Android Developer"),
    User(5,"Huseynbaba", "Rzaquliyev", "Android Developer"),
    User(6,"Mitch", "Tabian", "Software Developer"),
)

fun Route.users() {
    get("/users") {
        call.respond(
            HttpStatusCode.OK,
            users
        )
    }
}