package com.xingfeng_coder.inheritance

/**
 * Created by Xingfeng on 2017-06-21.
 */
open class Foo {
    open val x: Int
        get() {
            println("Foo")
            return 3
        }

    fun isValid(): Boolean = true

    fun doSomething() {
        println("foo do something")
    }

}

class Bar1 : Foo() {
    override val x: Int = 2
}

fun main(args: Array<String>) {

    var foo = Foo()
    var bar = Bar1()
    println(foo.x)
    println(bar.x)

}


interface Aoo {
    val count: Int
}

class Aoo1(override val count: Int) : Aoo

class Aoo2 : Aoo {
    override var count: Int = 0
}




