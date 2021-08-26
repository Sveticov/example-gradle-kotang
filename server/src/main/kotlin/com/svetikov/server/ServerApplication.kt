package com.svetikov.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@RestController
class ServerApplication

fun main(args: Array<String>) {
    runApplication<ServerApplication>(*args)
}

@GetMapping("/test")
fun test()="Hello"

