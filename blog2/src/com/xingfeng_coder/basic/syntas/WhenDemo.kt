package com.xingfeng_coder.basic.syntas

/**
 * When表达式
 * Created by Xingfeng on 2017-06-12.
 */
fun describe(obj: Any): String =

        when (obj) {

            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"

        }

/**
 * 很多情况对应一种处理逻辑，以逗号分割情况
 */
fun someCaseSameHandle(obj: Int) {

    when (obj) {

        0, 1 -> println("obj==0 or obj==1")
        else -> println("otherwise")

    }

}

/**
 * when的条件分支可以检查值是否落在一个范围里或集合里
 */
fun rangeWhen(x: Any) {

    val validNumbers = listOf("1", "2", "3")

    when (x) {

        in 1..10 -> println("x is in the range")  //位于一个范围
        in validNumbers -> println("x is valid")  //位于数组中
        !in 10..20 -> println("x is outside the range") //在范围之外
        else -> println("none of the above")
    }


}

/**
 * when与is配合使用
 */
fun hasPrefix(x: Any) = when (x) {

    is String -> x.startsWith("kotlin")
    else -> false

}

/**
 * when取代if-else
 */
fun replaceIfElse(x:Int){

    when{
        x/2==0 -> println("x is even")
        x/2==1 -> println("x is odd")
        else -> print("i don't know")
    }

}

fun main(args: Array<String>) {
//    println(describe(1))
//    println(describe(2L))
//    println(describe("Hello"))
//    println(describe

//    someCaseSameHandle(0)
//    someCaseSameHandle(1)
//    someCaseSameHandle(2)

//    rangeWhen(1)
//    rangeWhen("1")
//    rangeWhen(11)
//    rangeWhen(30)

//    println(hasPrefix("kotlin,hello"))
//    println(hasPrefix("hello,kotlin"))

    replaceIfElse(1)
    replaceIfElse(2)

}
