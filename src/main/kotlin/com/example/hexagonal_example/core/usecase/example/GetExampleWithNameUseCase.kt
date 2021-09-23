package com.example.hexagonal_example.core.usecase.example

import com.example.hexagonal_example.core.domain.example.Example
import com.example.hexagonal_example.core.ports.`in`.usecase.example.GetExampleWithNameUseCasePort
import com.example.hexagonal_example.core.service.ExampleService
import org.springframework.stereotype.Component

@Component
class GetExampleWithNameUseCase(
    private val exampleService: ExampleService
) : GetExampleWithNameUseCasePort {

    override fun execute(): Example {
        val someNumber = exampleService.getExampleAndDoSomeLogic()
        return Example("example", someNumber)
    }
}