package com.xingfeng_coder.basic.syntas

/**
 * Created by Xingfeng on 2017-06-12.
 */
fun main(args: Array<String>) {

    //检查数字是否在某个范围里
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }

    //检查数字是否超过了某个范围
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }

    //在一个范围上迭代
    for (x in 1..5) {
        println(x)
    }


    //在一个范围上指定步长迭代
    for (x in 1..10 step 2) {
        println(x)
    }

    for (x in 9 downTo 0 step 3) {
        println(x)
    }


}