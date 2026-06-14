package ru.k.config

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.plugins.cors.routing.*
import com.asyncapi.kotlinasyncapi.ktor.AsyncApiPlugin
import com.asyncapi.kotlinasyncapi.context.service.AsyncApiExtension
import io.ktor.server.plugins.openapi.*
import io.ktor.server.routing.*
import io.ktor.server.plugins.swagger.*

fun Application.configureHttp() {
    install(CORS) {
        allowMethod(HttpMethod.Options)
        allowMethod(HttpMethod.Put)
        allowMethod(HttpMethod.Delete)
        allowMethod(HttpMethod.Patch)
        allowHeader(HttpHeaders.Authorization)
        anyHost()
    }
    install(AsyncApiPlugin) {
        extension = AsyncApiExtension.builder {
            info {
                title("TODO API")
                version("1.0.0")
            }
        }
    }
    routing {
        openAPI(path = "openapi") {

        }
    }
    routing {
        swaggerUI(path = "openapi") {

        }
    }
}
