package com.xingfeng_coder.`fun`

import java.util.concurrent.locks.Lock
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod

/**
 * Created by Xingfeng on 2017-06-28.
 */

/**
 * 高阶函数
 */
fun <T> lock(lock: Lock, body: () -> T): T {

    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }

}

fun <T> max(collection: Collection<T>, less: (T, T) -> Boolean): T? {

    var max: T? = null
    for (it in collection) {
        if (max == null || less(max, it))
            max = it
    }
    return max

}


val sum = { x: Int, y: Int -> x + y }

val sum2: (Int, Int) -> Int = { x, y -> x + y }

fun <T, R> List<T>.transfrom(transformFun: (T) -> R): List<R> {

    var result = arrayListOf<R>()
    for (item in this) {
        var newItem = transformFun(item)
        result.add(newItem)
    }
    return result

}

/**
 * 匿名函数
 */
var test2 = fun(x: Int, y: Int): Int = x + y


/**
 * 带接受者的函数字面值
 */


fun main(args: Array<String>) {

    val ints = arrayListOf<Int>()
    ints.add(1)
    ints.add(2)
    ints.add(3)

    ints.forEach { print("$it ") }

    val newInts = ints.transfrom {

        value ->
        value * 2

    }

    newInts.forEach {

        print("$it ")

    }


}
