package com.xingfeng_coder

/**
 * Created by Xingfeng on 2017-06-20.
 */
/**
 * 标签
 */
fun labelDemo() {

    outer@ for (i in 1..10) {
        inner@ for (j in 1..10) {
            println("i=$i j=$j")
            if (i == 3)
                break@inner
            if (j == 4)
                continue@outer
        }
    }

}

fun foo() {
    val ints = listOf(1, 2, 0, 3)
    ints.forEach {
        if (it == 0)
            return
        println(it)
    }
    println("end")

}

fun foo_1() {
    val ints = listOf(1, 2, 0, 3)
    ints.forEach lit@ {
        if (it == 0)
            return@lit
        println(it)
    }
    println("end")
}

fun foo_2() {
    val ints = listOf(1, 2, 0, 3)
    ints.forEach {
        if (it == 0)
            return@forEach
        println(it)
    }
    println("end")
}

fun foo_3() {
    val ints = listOf(1, 2, 0, 3)
    ints.forEach(fun(value: Int) {
        if (value == 0)
            return
        println(value)
    })
    println("end")
}

fun main(args: Array<String>) {

//    labelDemo()

    foo()
    foo_1()

}