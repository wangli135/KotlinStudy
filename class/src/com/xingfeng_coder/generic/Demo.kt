package com.xingfeng_coder.generic

/**
 * Created by Xingfeng on 2017-06-26.
 */
class Box<T>(t: T) {
    var value = t
}

abstract class Source<out T> {
    abstract fun nextT(): T
}

fun demo(strs: Source<String>) {
    val objects: Source<Any> = strs;
}


abstract class Comparable<in T> {
    abstract fun compareTo(other: T): Int
}

fun demo1(x: Comparable<Number>) {

    x.compareTo(1.0)
    val y: Comparable<Double> = x


}

fun main(args: Array<String>) {
    val box: Box<Int> = Box<Int>(1)
    val box2 = Box(1)
}
