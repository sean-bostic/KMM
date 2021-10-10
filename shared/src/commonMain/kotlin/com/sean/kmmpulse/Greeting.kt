package com.sean.kmmpulse

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}