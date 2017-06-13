package com.xingfeng_coder.basic.syntas

/**
 * 循环
 * Created by Xingfeng on 2017-06-12.
 */
fun main(args: Array<String>) {

    //for循环 demo
    val items = listOf("apple", "banana", "kiwi")  //listOf()的返回值是List类型
    for (item in items) {
        println(item)
    }

    //List的indices参数表示下标的集合
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    for ((index, value) in items.withIndex()) {
        println("item at $index is $value")
    }

    //while循环 demo
    var index = 0
    while (index< items.size) {
        println(items[index])
        index++
    }


}
