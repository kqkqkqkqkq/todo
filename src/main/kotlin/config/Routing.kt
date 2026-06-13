package ru.k.config

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ru.k.routes.greeting.configureGreetingRoutes

fun Application.configureRouting() {
    configureGreetingRoutes()
}
