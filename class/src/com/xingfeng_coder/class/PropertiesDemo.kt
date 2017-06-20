package com.xingfeng_coder.`class`

const val SCHOOL: String = "华中科技大学"

@Deprecated(SCHOOL) fun foo() {}

/**
 * Created by Xingfeng on 2017-06-20.
 */
class Student {

    var id: Int = 0
    var name: String = ""

    var age: Int = 0

}

class MyList {

    var size = 0
    var isEmpty = true
        get() = this.size == 0
    var sizeString: String
        get() = "$size"
        set(value) {
            size = value.toInt()
        }

    var counter = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

}

//class TestSubject
//
//class MyTest{
//    lateinit var subject:TestSubject
//
//    @Setup
//    fun setup(){
//
//    }
//
//    @Test
//    fun test(){
//
//    }
//
//
//}

fun copyStudent(student: Student): Student {
    val result = Student()
    result.id = student.id
    result.name = student.name
    result.age = student.age
    return result
}