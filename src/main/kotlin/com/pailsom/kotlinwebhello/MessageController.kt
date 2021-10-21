package com.pailsom.kotlinwebhello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class Message(val text:String, val priority:String)

@RestController
class MessageController {
    @RequestMapping("/message")
    fun message():Message{
        return Message("Hello Kotlin Developer from Google Cloud","High")
    }
}