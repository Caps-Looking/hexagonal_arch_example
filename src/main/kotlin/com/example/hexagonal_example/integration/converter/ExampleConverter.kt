package com.example.hexagonal_example.integration.converter

import com.example.hexagonal_example.core.domain.example.Example
import com.example.hexagonal_example.integration.response.example.ExampleResponse

class ExampleConverter {

    companion object {
        fun convert(response: ExampleResponse) = with(response) {
            Example(name = "", someNumber = someNumber)
        }
    }

}