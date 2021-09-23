package com.example.hexagonal_example.core.ports.`in`.usecase.example

import com.example.hexagonal_example.core.domain.example.Example

interface GetExampleWithNameUseCasePort {

    fun execute(): Example

}