package com.xingfeng_coder.basic.syntas

/**
 * Created by Xingfeng on 2017-06-12.
 */
fun parseInt(str: String): Int? {
    //模拟转换
    return if (str.equals("1")) 1 else null
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number")
    }

}

fun main(args: Array<String>) {

    printProduct("1", "2")
    printProduct("1", "1")

}