package ru.k.service

class GreetingServiceImpl: GreetingService {
    override suspend fun sayHello(): String {
        return "Hello"
    }
}
