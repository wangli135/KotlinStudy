package src.com.xingfeng_coder.annotation

import kotlin.reflect.KClass

/**
 * Created by Xingfeng on 2017-06-30.
 */
/**
 * 声明注解，annotation放在class之前
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy

/**
 * 带构造器的注解
 */
annotation class Sepcial(val why: String)

annotation class Ann(val arg1: KClass<*>, val arg2: KClass<out Any>)

@Ann(String::class, Int::class)
class MyClass


@Sepcial("example")
@Fancy
class Foo {

    @Fancy
    fun baz(@Fancy foo: Int): Int {
        return (@Fancy 1)
    }

}

@Ann22(intValue = 1, stringValue = "abc") class c

@AnnWithValue("abc") class cc

@AnnWithArrayValue("abc", "foo", "bar") class ccc

@AnnWithArrayMethod(names = arrayOf("abc", "foo", "bar")) class cccc

fun foo(ann: Ann22) {
    val i = ann.intValue
}