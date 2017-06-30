package com.xingfeng_coder.declaration

/**
 * Created by Xingfeng on 2017-06-29.
 */

fun foo(i: Int) {

    if (i in 1..10) {   //等价于i>=1&&i<=10
        println(i)
    }

}

fun main(args: Array<String>) {

    for (i in 1..4)
        print(i)  //输出 1234

    for (i in 4..1)
        print(i)  //什么都不输出


    println()

    //逆序打印
    for (i in 4 downTo 1)
        print(i)  //输出4321

    println()

    //使用指定步长
    for (i in 1..4 step 2)
        print(i)  //输出13
    println()
    for (i in 4 downTo 1 step 2)
        print(i)  //输出42

    println()
    //使用until，不包含最后一个数
    for (i in 1 until 10)
        print(i)  //输出123456789

}