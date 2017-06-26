package com.xingfeng_coder.dataandsealed

/**
 * Created by Xingfeng on 2017-06-26.
 */
data class User(val name: String, val age: Int)

fun main(args: Array<String>) {

    val user = User("wangli", 25)
    println(user)

    //Copy
    val jack = user.copy(name = "jack", age = 26)
    println(jack)

    //解析声明
    val (name, age) = user
    println("$name,$age years of age")

}
