package com.xingfeng_coder.delegation

import com.xingfeng_coder.inheritance.Foo
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by Xingfeng on 2017-06-27.
 */
class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

/**
 * lazy()函数
 */
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

val lazyValueWithoutLock: String by lazy(LazyThreadSafetyMode.PUBLICATION) {
    println("computed!")
    "hello"
}

val lazyValueOneThread: String by lazy(LazyThreadSafetyMode.NONE) {
    println("computed!")
    "hello"
}


/**
 * Delegates.observable()
 */
class User {

    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }

    var age: Int by Delegates.vetoable(25) {
        prop, old, new ->
        new > 0
    }


}

/**
 * 将属性存入Map中
 */
class Person(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

class MutablePerson(val map: MutableMap<String, Any?>) {

    var name: String by map
    var age: Int by map

}

/**
 * 局部委托属性
 */
fun example(computeFoo: () -> Foo) {

    val memoizedFoo by lazy(computeFoo)

    if (true && memoizedFoo.isValid()) {
        memoizedFoo.doSomething()
    }


}




fun main(args: Array<String>) {
//    val e = Example()
//    println(e.p)
//
//    e.p = "NEW"

//    println(lazyValue)
//    println(lazyValue)

//    val user = User()
//    user.name = "first"
//    user.name = "second"
//
//    println(user.age)
//    user.age = 15
//    println(user.age)
//    user.age = -1
//    println(user.age)

//    val person = Person(mapOf("name" to "Wangli",
//            "age" to 25))
//
//    println(person.name) //Wangli
//    println(person.age)  //25

    example {
        Foo()
    }

    example {
        println("h")
        Foo()
    }



}