package com.xingfeng_coder.`class`

/**
 * Created by Xingfeng on 2017-06-20.
 */
open class A(x: Int) {
    open val y: Int = x
}

interface B {
    fun foo()
}

val ab: A = object : A(1), B {
    override fun foo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val y = 15

}


class E {
    //私有函数，返回值是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    //公有函数，返回值是Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x    //ok
//        val x2 = publicFoo().x   //error
    }

}

class DataProvider

object DataProviderManager {

    val providers = arrayListOf<DataProvider>()

    fun registerDataProvider(provider: DataProvider) {
        providers.add(provider)
    }

    val allDataProviders: Collection<DataProvider>
        get() = providers

}

class MyClass {
    companion object : Factory<MyClass> {
        override fun create() = MyClass()
    }
}

val myclass = MyClass.create()

interface Factory<T> {
    fun create(): T
}