package com.lt2.lt2hexagonalspringserver

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
class TransactionAspect {

//    @Before("@annotation(com.lt2.lt2hexagonalspringserver.ApplyTransaction)")
//    fun applyTransaction() {
//        println("success apply")
//    }

//    @Before("applyTransaction()")
//    fun around(joinPoint: JoinPoint) {
//        println("success aspect")
//    }

//    @Around("@annotation(ApplyTransaction)")
//    fun applyTransaction(joinPoint: ProceedingJoinPoint): Any? {
//        val proceed: Any? = joinPoint.proceed()
//
//        println("success apply")
//
//        return proceed
//    }

//    @Before("@annotation(org.springframework.transaction.annotation.Transactional)")
//    fun around() {
//        println("time")
//    }

//    @Before("@annotation(com.lt2.lt2hexagonalspringserver.ApplyTransaction)")
//    fun before() {
//        println("test apply")
//    }

//    @Before("@annotation(com.lt2.lt2hexagonalspringserver.ApplyTransaction)")
//    fun applyTransaction() {
//
//
//
//
//    }

}