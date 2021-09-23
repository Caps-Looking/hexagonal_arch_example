package com.example.hexagonal_example.core.service

import com.example.hexagonal_example.core.ports.out.client.example.ExampleClientPort
import org.springframework.stereotype.Service

@Service
class ExampleService(
    private val exampleClientPort: ExampleClientPort
) {

    fun getExampleAndDoSomeLogic(): Int {
        val example = exampleClientPort.fetchExample()

        return if (example.someNumber == 1) {
            example.someNumber + 1
        } else {
            example.someNumber
        }
    }

}
