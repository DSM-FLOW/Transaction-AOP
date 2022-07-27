package com.lt2.lt2hexagonalspringserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val testService: TransactionTestService
) {

    @GetMapping
    fun test() {
        testService.test()
    }

}