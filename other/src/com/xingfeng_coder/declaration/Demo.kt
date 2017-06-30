package com.xingfeng_coder.declaration

import org.omg.PortableInterceptor.INACTIVE
import javax.jnlp.PersistenceService

/**
 * Created by Xingfeng on 2017-06-29.
 */
/**
 * 使用数据类，自动拥有componentN()函数
 */
data class Person(val name: String, val age: Int)

/**
 * 不使用数据类，实现componentN()函数
 */
class Student(val name: String, val age: Int) {

    operator fun component1(): String {
        return name
    }

    operator fun component2(): Int {
        return age
    }


}


/**
 * 例1：一个函数返回两个值
 */
data class Result(val result: Int, val status: Int)

fun functionWithTwoReturnValue(): Result {

    return Result(1, 2)

}


fun main(args: Array<String>) {

    val (name, age) = Person("wangli", 25)
    println(name)
    println(age)

    val (sName, sAge) = Student("wangli", 25)
    println(sName)
    println(sAge)

    //创建集合
    val studentArray = arrayOf(Person("wangli", 25), Person("zhangjia", 24))

    for ((a, b) in studentArray) {

        println("name:$a  age:$b")

    }

    val (result, status) = functionWithTwoReturnValue()
    println(result)
    println(status)


    /**
     * 遍历map
     */
    val map = mutableMapOf<String, String>()
    map.put("Key1", "Value1")
    map.put("Key2", "Value2")
    map.put("Key3", "Value3")

    for ((key, value) in map) {

        println("$key->$value")

    }

    /**
     * 使用下划线代替
     */

    val (_, pAge) = Person("wangli", 25)
    println(pAge)

    /**
     * lambda中的解构声明
     */
    map.mapValues {
        entry ->
        "${entry.value}"
    }.forEach { t, u -> println("$t $u") }

    map.mapValues {
        (key, value) ->
        "$value!"
    }.forEach {
        println("$it")
    }

    map.mapValues {

        (_, value): Map.Entry<String, String> ->
        "$value!"

    }

    map.mapValues {

        (_, value: String) ->
        "$value!"

    }


}
