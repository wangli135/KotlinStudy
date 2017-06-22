package com.xingfeng_coder.inheritance

/**
 * Created by Xingfeng on 2017-06-21.
 */
open class Base {
    open fun v() {
        println("Base.v()")
    }

    fun nv() {
        println("Base.nv")
    }

}

class Derived() : Base() {

    override fun v() {
        println("Derived.v()")
    }

}

open class AnotherDerived() : Base() {
    final override fun v() {
        println("AnotherDerived.v")
    }
}

fun main(args: Array<String>) {

    var base1: Base = Base()
    var base2: Base = Derived()
    var base3: Base = AnotherDerived()

    base1.v()
    base2.v()
    base3.v()

}

