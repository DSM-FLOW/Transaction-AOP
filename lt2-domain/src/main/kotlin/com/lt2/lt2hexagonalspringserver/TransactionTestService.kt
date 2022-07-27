package com.lt2.lt2hexagonalspringserver

import org.springframework.transaction.annotation.Transactional

@ApplicationService
class TransactionTestService {

    @Transactional(rollbackFor = [RuntimeException::class])
    fun test() {
        println("test success")
    }

}