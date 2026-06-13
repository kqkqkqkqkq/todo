package ru.k.config

import io.ktor.server.application.*
import io.ktor.server.plugins.di.*
import ru.k.service.GreetingServiceImpl

fun Application.configureDependencyInjection() {
    dependencies {
        provide { GreetingServiceImpl() }
    }
}
