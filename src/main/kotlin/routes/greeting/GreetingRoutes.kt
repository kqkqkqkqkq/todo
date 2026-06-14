package ru.k.routes.greeting

import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.configureGreetingRoutes() {
    routing {
        get("/") {
            try {
                call.respondText("Hello, World!")
            } catch (e: Exception) {

            }
        }
    }
}
