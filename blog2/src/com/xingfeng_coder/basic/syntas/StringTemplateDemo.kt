package com.xingfeng_coder.basic.syntas

/**
 * Created by Xingfeng on 2017-06-12.
 */
fun main(args: Array<String>) {
    var a=1
    val s1="a is $a"
    a=2
    val s2="${s1.replace("is","was")},but now is $a"
    println(s1)
    println(s2)
}