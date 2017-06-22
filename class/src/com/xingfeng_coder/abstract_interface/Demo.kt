package com.xingfeng_coder.abstract_interface

/**
 * Created by Xingfeng on 2017-06-22.
 */
open class Base {
    open fun f() {

    }
}

abstract class Derived : Base() {
    override abstract fun f()
}

interface MyInterface {

    val prop: Int  //抽象的

    val propertyWithImplementation: String
        get() = "abc"

    fun bar()
    fun foo() {
        println("MyInterface.foo")
    }
}

class ChildOfInterface : MyInterface {
    override val prop: Int
        get() = 3

    override fun bar() {
        foo()
    }

    override fun foo() {
        super.foo()
        println("ChildOfInterface.foo")
    }

}

interface A {
    fun foo() {
        println("A")
    }

    fun bar()

}

interface B {
    fun foo() {
        println("B")
    }

    fun bar() {
        println("bar")
    }

}

class C : A {
    override fun bar() {
        println("C.bar")
    }
}

class D : A, B {
    override fun foo() {

        super<A>.foo()
        super<B>.foo()
        println("D.foo")
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main(args: Array<String>) {
    var d = D()
    d.foo()
    d.bar()
}








