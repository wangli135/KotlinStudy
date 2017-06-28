package com.xingfeng_coder.`fun`

import java.util.HashMap
import kotlin.coroutines.experimental.RestrictsSuspension

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


fun main(args: Array<String>) {

    async {
        doSomething()
    }

}
