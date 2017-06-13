package com.xingfeng_coder.basic.types

/**
 * Created by Xingfeng on 2017-06-12.
 */
fun main(args: Array<String>) {

    //整形字面常量
    val a = 123
    val b = 123L
    val c = 0xff //十六进制表示
    val d = 0b00110100 //二进制表示

    //浮点型字面常量表示
    val e = 2.34   //浮点型默认为double类型
    val f = 3.2f   //如果要使用float类型，需要加入f或F

    //数值字面量中的下划线可以增加可读性
    val oneMillon = 1_000_000
    val creditCarNumber = 1234_5678_9912_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0XFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    //表示，当使用Int？类似时会自动装箱
    val g: Int = 10000
    val boxA: Int? = g
    val anotherBoxA: Int? = g
    println(g === g) //true
    println(boxA === anotherBoxA)  //false
    println(g == g)  //true
    println(boxA == anotherBoxA)  //true

    //显式转换
//    val h:Int?=1
//    val j:Long?=a
//    println(h==j)

    //数组
    val array1 = arrayOf(1, 2, 3)  //[1,2,3]
    val array2 = Array(5, { i -> (i * i).toString() })  //["0","1","4","9","16"]
    for (s in array2.indices) {
        println("array[$s] is ${array2[s]}")
    }

    //字符串
    val s = "Hello,Kotlin"
    //可以使用s[i]操作字符串索引
    println(s[1])
    //可以使用for循环迭代字符串
    for (c in s) {
        println(c)
    }

    val text = """
     for(c in "foo")
        print(c)
    """

    println(text)

    val text1="""
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn
        |(Benjamin Franklin)
    """
    println(text1)
    println(text1.trimMargin())



}
