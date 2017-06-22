package com.xingfeng_coder.inheritance

/**
 * Created by Xingfeng on 2017-06-21.
 */
open class A {
    open fun f() {
        println("A")
    }

    fun a() {
        println("a")
    }

}

interface B {
    fun f() {
        println("B")
    }

    fun b() {
        println("b")
    }

}

class C() : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
        println("C")
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.f()
}


