package com.xingfeng_coder.`class`

/**
 * Created by Xingfeng on 2017-06-20.
 */
class OuterClass {
    private val bar = 3

    class Nested {
        fun foo() = 2
    }

    inner class Inner {
        fun foo() = bar
    }

}

val demo = OuterClass.Nested().foo()  //==2
val demo_1 = OuterClass().Inner().foo() //==3
