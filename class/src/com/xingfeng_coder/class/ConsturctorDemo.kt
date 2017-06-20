package com.xingfeng_coder.`class`

/**
 * Created by Xingfeng on 2017-06-20.
 */
class Person constructor(firstName: String) {
    init {
        println(firstName)
    }

    val key = firstName.toUpperCase()
}

class Person_1(val firstName: String, val lastName: String, var age: Int) {

}

class Person_2 {
    constructor(parent: Person_2) {

    }
}

class Person_3(name: String) {
    constructor(firstName: String, lastName: String) : this(firstName) {

    }
}

class DontCreateMe private constructor() {
}

//class Consumer public @Inject constructor(name: String) {
//
//}
fun main(args: Array<String>) {
    val person=Person("wangli")
    val person_1=Person_1("wang","li",25)
}


