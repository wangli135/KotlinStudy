package com.xingfeng_coder.enum

/**
 * Created by Xingfeng on 2017-06-27.
 */

enum class RGB {
    RED, GREEN, YELLOW
}

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}

fun main(args: Array<String>) {

//    val south = Direction.valueOf("SOUTH")
//    println(south)

//    printAllValues<RGB>()

    for (i in Direction.values()) {
        println(i.name + " " + i.ordinal)
    }


}