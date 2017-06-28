package com.xingfeng_coder.`fun`

/**
 * Created by Xingfeng on 2017-06-27.
 */
fun double(x: Int): Int {
    return x
}

/**
 * 中缀表达式
 */
infix fun Int.haha(x: Int): Int {
    return x
}

/**
 * 带默认参数的函数
 */
fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) {

    for (i in off..len) {

        println(b[i])

    }

}


open class A {

    open fun foo(i: Int = 10) {
        println(i)
    }

}

open class B : A() {
    override fun foo(i: Int) {
        println(i)
    }
}


/**
 * 命名参数
 */
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {

}


/**
 * 返回类型为Unit的函数
 */
fun printHello(name: String?): Unit {

    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")

}

/**
 * 单表达式函数
 */
fun doubleX(x: Int): Int = x * 2

/**
 * 可变参数
 */
fun total(vararg x: Int): Int {

    var total = 0
    for (i in x)
        total += i
    return total
}

fun sum(vararg array: Int, x: Int): Int {

    var total = 0
    for (i in array)
        total += i
    total += x
    return total


}


/**
 * 局部函数，函数中再声明函数
 */
fun numOfX(x: Int, vararg array: Int): Int {

    fun isEqual(y: Int) = x == y

    var num = 0
    for (i in array)
        if (isEqual(i))
            num++

    return num


}

/**
 * 成员函数
 */
class Sample {

    fun foo() {
        println("foo")
    }

}

/**
 * 尾递归函数
 */
tailrec fun findFixPoint(x: Double = 1.0): Double =
        if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))


fun main(args: Array<String>) {
    //    1 shl 2
//    1.shl(2)

//    com.xingfeng_coder.`fun`.read(kotlin.arrayOf(1, 2, 3))
//    com.xingfeng_coder.`fun`.read(kotlin.arrayOf(1, 2, 3), 2)
//    com.xingfeng_coder.`fun`.read(kotlin.arrayOf(1, 2, 3), 2, 4)

//    A().foo()  //10
//    B().foo()  //10

//    reformat("hello")
//
//    //使用命名参数
//    reformat("hello", normalizeCase = true, upperCaseFirstLetter = false, divideByCamelHumps = false, wordSeparator = '_')
//    reformat("hello", upperCaseFirstLetter = false, wordSeparator = '_')

//    println(total(1, 2, 3))
//
//    println(sum(1, 2, 3, x = 4))
//
//    val a = arrayOf(1, 2, 3)
//    val list = listOf(-1, 0, *a, 4)

//    println(numOfX(1, 1, 1, 2, 2))


    println(findFixPoint())

}
