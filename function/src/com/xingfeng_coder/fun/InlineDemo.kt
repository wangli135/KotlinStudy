package com.xingfeng_coder.`fun`

import sun.text.resources.cldr.om.FormatData_om
import java.util.concurrent.locks.Lock
import javax.swing.tree.TreeNode

/**
 * Created by Xingfeng on 2017-06-28.
 */
inline fun <T> lock2(lock: Lock, body: () -> T): T {

    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }

}

/**
 * 禁用内联
 */
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {

}

fun ordinaryFuction(body: () -> Unit) {
    body()
    println("hello")
}

inline fun inlineFunction(body: () -> Unit) {
    body()
    println("inline")
}

fun foo() {

    ordinaryFuction {
        println("ordinaryFuction")
//        return //错误

//        return@ordinaryFuction  //正确
    }

    inlineFunction {
        return  //正确
    }

}


fun hasZeros(ints: List<Int>): Boolean {

    ints.forEach {

        if (it == 0)
            return true

    }

    return false

}

inline fun f(crossinline body: () -> Unit) {

    val f = Runnable { body() }

    f.run()

}

/**
 * 具体化参数类型
 */
//fun <T> TreeNode.findParentOfType(clazz:Class<T>):T?{
//
//    var p=parent
//    while(p!=null&&!clazz.isInstance(p)){
//        p=p.parent
//    }
//    return p as T?
//
//}

inline fun <reified T> TreeNode.findParentOfType(): T? {

    var p = parent
    while (p != null && p !is T) {
        p = p.parent
    }
    return p as T?

}


/**
 * 内联属性
 */

fun main(args: Array<String>) {
    f {
        printHello("Wangli")
    }
}
