package com.xingfeng_coder.basic.syntas

/**
 * 类型检查和自动转型
 * Created by Xingfeng on 2017-06-12.
 */
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        //obj 在该分支下会自动转换成“String”类型
        return obj.length
    }

    //obj 仍然是外部分支的“Any”类型
    return null

}

fun getStringLength_1(obj: Any): Int? {

    if (obj !is String) return null
    //obj 在该分支下被自动转型为“String”类型
    return obj.length

}

fun getStringLength_2(obj: Any): Int? {

    if (obj is String && obj.length > 0)
        return obj.length

    return null

}

fun main(args: Array<String>) {

    println(getStringLength("hello"))
    println(getStringLength_1("world"))
    println(getStringLength_1(234))

}


