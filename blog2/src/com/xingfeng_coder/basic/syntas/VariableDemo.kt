package com.xingfeng_coder.basic.syntas

/**
 * 变量
 * Created by Xingfeng on 2017-06-12.
 */
fun main(args: Array<String>) {

    /**
     * 演示变量的定义，包括常量和变量
     */
    val a: Int = 1   //声明并赋值
    val b = 2     //声明并赋值，但是类型需要推断
    val c: Int   //先声明
    c = 3   //后赋值
//    b = 1   //尝试修改b的值，报错

    var x = 3
    x += 1
    println(x)

}