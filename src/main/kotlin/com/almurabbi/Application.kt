package com.almurabbi

import io.ktor.server.application.*
import com.almurabbi.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureSecurity()
    configureRouting()

    val passGen = System.getenv("PASS")
    val pass = "@ + $passGen"

    println(pass)
    println(passGen)
}



