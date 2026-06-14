package ru.k.routes.greeting

import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.openapi.describe
import io.ktor.server.routing.routing
import io.ktor.utils.io.ExperimentalKtorApi

@OptIn(ExperimentalKtorApi::class)
fun Application.configureGreetingRoutes() {
    routing {
        get("/greeting") {
            try {
                call.respondText("Hello, World!")
            } catch (e: Exception) {

            }
        }.describe {
            summary = "Get greeting"
        }
    }
}
