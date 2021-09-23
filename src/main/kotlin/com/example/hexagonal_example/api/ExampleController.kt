package com.example.hexagonal_example.api

import com.example.hexagonal_example.core.domain.example.Example
import com.example.hexagonal_example.core.ports.`in`.usecase.example.GetExampleWithNameUseCasePort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/example")
class ExampleController(
    private val getExampleWithNameUseCasePort: GetExampleWithNameUseCasePort
) {

    @GetMapping
    fun getExampleWithNameUseCase(): Example = getExampleWithNameUseCasePort.execute()

}