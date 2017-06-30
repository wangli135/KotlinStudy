package com.xingfeng_coder.`fun`

import java.util.HashMap
import kotlin.coroutines.experimental.RestrictsSuspension
import kotlin.coroutines.experimental.buildSequence

/**
 * Created by Xingfeng on 2017-06-28.
 */
suspend fun doSomething() {

    for (i in 1..10)
        println(i)

}

fun <T> async(block: suspend () -> T) {

}

/**
 * 挂起函数可以是虚拟的
 */

interface Base {

    suspend fun foo()

}

class Derived1 : Base {

    suspend override fun foo() {
    }

}


val fibonacciSeq = buildSequence {
    var a = 0
    var b = 1
    yield(1)
    while (true) {
        yield(a + b)
        val tmp = a + b
        a = b
        b = tmp
    }
}

fun main(args: Array<String>) {

//    async {
//        doSomething()
//    }

    fibonacciSeq.take(8).forEach {
        print("$it ")
    }

}
