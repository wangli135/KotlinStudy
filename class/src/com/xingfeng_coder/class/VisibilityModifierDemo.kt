package com.xingfeng_coder.`class`

/**
 * Created by Xingfeng on 2017-06-20.
 */
fun baz() {}

class Bar {}

open class Outer {

    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected class Nested {
        public val e: Int = 5
    }

}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible
    override val b = 5 // 'b' is protected
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
// o.c and o.d are visible (same module)
// Outer.Nested is not visible, and Nested::e is not visible either
}

/**
 * 指定主构造器的可见性
 */
class C private constructor(a: Int) {

}









