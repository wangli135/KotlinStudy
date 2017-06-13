package com.xingfeng_coder.basic.syntas

/**
 * 函数
 * Created by Xingfeng on 2017-06-12.
 */
/**
 * 该函数有两个Int类型的形参，并且返回值为Int
 */
fun sum_1(a: Int, b: Int): Int {
    return a + b
}

/**
 * 该函数使用表达式表示方法体，并且方法返回值由表达式推断
 */
fun sum_2(a: Int, b: Int) = a + b

/**
 * 函数返回值为没有意义的值
 */
fun printSum_1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

/**
 * 函数返回值为没有意义的值，有无Unit效果类似
 */
fun printSum_2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main(args: Array<String>) {
    printSum_1(2, 3)
    printSum_2(2, 3)
}
