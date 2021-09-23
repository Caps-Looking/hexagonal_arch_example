package com.example.hexagonal_example.core.ports.out.client.example

import com.example.hexagonal_example.core.domain.example.Example

interface ExampleClientPort {

    fun fetchExample(): Example

}