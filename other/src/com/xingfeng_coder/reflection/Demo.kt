package src.com.xingfeng_coder.reflection

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

/**
 * Created by Xingfeng on 2017-06-30.
 */
/**
 * 类引用  ::class 语法
 */
val a = Int::class
val b = Integer::class.java

/**
 * 函数引用
 */
fun isOdd(x: Int) = x % 2 != 0

fun isOdd(x: String) = x == "brillig" || x == "slithy" || x == "tove"

/**
 * 函数组合
 */

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {

    return { x -> f(g(x)) }

}

fun length(s: String) = s.length

/**
 * 属性引用
 */
var x = 1

//类的属性引用
class A(val p: Int)

//扩展属性
val String.lastChar: Char
    get() = this[length - 1]

/**
 * 构造器引用
 */

class Foo

fun function(factory: () -> Foo) {

    val x: Foo = factory()

}


fun main(args: Array<String>) {

    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))

    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")

    println(strings.filter(oddLength))

    println(::x.get())  //1
    ::x.set(2)
    println(x) //2

    println(strings.map(String::length))

    val prop = A::p
    println(prop.get(A(1))) //1

    println(String::lastChar.get("abc"))  //c

    //与Java的互操作性
    println(A::p.javaGetter)  //public final int src.com.xingfeng_coder.reflection.A.getP()
    println(A::p.javaField)   //private final int src.com.xingfeng_coder.reflection.A.p

    function(::Foo)

    //绑定的函数与属性引用
    val numberRegex = "\\d+".toRegex()
    println(numberRegex.matches("24"))  //true

    val isNumber = numberRegex::matches
    println(isNumber("24"))  //true

    println(strings.filter(numberRegex::matches))

    //绑定属性引用
    val pro = "abc"::length
    println(pro.get())


}