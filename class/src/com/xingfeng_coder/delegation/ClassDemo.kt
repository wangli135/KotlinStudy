package com.xingfeng_coder.delegation

/**
 * Created by Xingfeng on 2017-06-27.
 */
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

interface Base2 {
    fun foo()
}

class Base2Imple(val x: Int) : Base2 {
    override fun foo() {
        println("foo $x")
    }
}

/**
 * 委托给Base
 */
class Derived(b: Base) : Base by b, Base2 {
    override fun foo() {
        println("Derived foo")
    }
}


fun main(args: Array<String>) {

    val b = BaseImpl(10)
    val c = Base2Imple(100)
    Derived(b).print()  //输出 10
    Derived(b).foo()  //输出 foo 100
}


