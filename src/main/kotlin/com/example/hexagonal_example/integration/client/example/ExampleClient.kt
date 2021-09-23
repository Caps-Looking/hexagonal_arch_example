package com.example.hexagonal_example.integration.client.example

import com.example.hexagonal_example.integration.response.example.ExampleResponse
import com.example.hexagonal_example.core.ports.out.client.example.ExampleClientPort
import com.example.hexagonal_example.integration.converter.ExampleConverter
import org.springframework.stereotype.Component

@Component
class ExampleClient : ExampleClientPort {

    override fun fetchExample() = ExampleConverter.convert(ExampleResponse(1))

}