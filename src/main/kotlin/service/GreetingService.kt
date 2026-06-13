package ru.k.service

interface GreetingService {
    suspend fun sayHello(): String
}