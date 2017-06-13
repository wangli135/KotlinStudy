package com.xingfeng_coder.basic.syntas

/**
 * Created by Xingfeng on 2017-06-12.
 */
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOfUsingIfExpress(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println(maxOf(3, 2))
    println(maxOfUsingIfExpress(3, 4))

    val a = 2
    val b = 3
    //传统用法
    var max = a
    if (a < b)
        max = b

    //if-else用法
    if (a > b) {
        max = a
    } else {
        max = b
    }

    //if表达式
    max = if (a > b) a else b

    //if表达式的分支是块的话，那么最后一个表达式的值就是if表达式的返回值
    val max2 = if (a > b) {
        print(a)
        a
    } else {
        print(b)
        b
    }


}
