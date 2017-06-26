package com.xingfeng_coder.extensions

/**
 * Created by Xingfeng on 2017-06-26.
 */
/**
 * 扩展函数的定义
 */
fun MutableList<Int>.swap(index1: Int, index2: Int) {

    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp

}

/**
 * 扩展函数的定义，加入泛型
 */
fun <T> MutableList<T>.swapWithGeneric(index1: Int, index2: Int) {

    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp

}

/**
 * 验证扩展函数的静态解析，只与声明时的类型相关
 */
open class CC

class DD : CC()

//扩展CC，增加foo函数
fun CC.foo() = "cc"

//扩展DD，增加foo函数
fun DD.foo() = "dd"

fun printFoo(cc: CC) {
    println(cc.foo())
}

/**
 * 验证，成员和扩展相同时
 */
class C {
    //类成员函数
    fun foo() {
        println("member")
    }
}

//扩展函数，与类成员函数相同
fun C.foo() {
    println("extensions")
}

fun C.foo(i: Int) {
    println("extensions")
}

/**
 * 接受类型可为空
 */
fun Any?.toString(): String {
    if (this == null)
        return "null"
    return this.toString()
}

/**
 * 扩展属性
 */

val <T> List<T>.lastIndex: Int
    get() = size - 1

/**
 * 伴生对象的扩展
 */

class MyClass {
    companion object {
        fun foo() {
            println("MyClass companion foo")
        }
    }
}

fun MyClass.Companion.bar() {
    println("MyClass companion bar")
}

/**
 * 扩展作为成员
 */
class D {
    fun bar() {
        println("D.bar")
    }
}

class CCC {

    fun baz() {
        println("CCC.baz")
    }

    fun D.foo() {
        bar()    //调用D.bar
        baz()    //调用CCC.baz

        toString()  //调用D.toString
        this@CCC.toString()   //调用CCC.toString

    }

    fun caller(d: D) {
        d.foo()   //调用扩展函数
    }


}


/**
 * 子类覆写扩展成员
 */

open class DDD

class D1 : DDD()

open class C1{

    open fun DDD.foo(){
        println("DDD.foo in c1")
    }

    open fun D1.foo(){
        println("D1.foo in c1")
    }

    fun caller(d:DDD){
        d.foo()   //调用扩展
    }

}

class C2:C1(){

    override fun DDD.foo(){
        println("DDD.foo in C2")
    }

    override fun D1.foo(){
        println("D1.foo in c2")
    }

}




fun main(args: Array<String>) {

//    val list = mutableListOf<Int>(1, 2, 3)
//    println("Before swap:")
//    for (i in list)
//        print("$i ")
//    list.swap(0, 2)
//    println()
//    println("After swap:")
//    for (i in list)
//        print("$i ")

//    printFoo(DD())

//    C().foo()
//    C().foo(1)

//    println(1.toString())
//    println(null.toString())

//    MyClass.foo()
//    MyClass.bar()

//    CCC().caller(D())


    C1().caller(DDD())  //输出DDD.foo in c1,
    C2().caller(DDD())  //输出DDD.foo in C2-分发接收器调用解析
    C1().caller(D1())   //输出DDD.foo in c1-扩展接收器静态解析

}





