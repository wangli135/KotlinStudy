package com.xingfeng_coder.inheritance

/**
 * Created by Xingfeng on 2017-06-21.
 */
class Parent

//因为Parent类没有使用open注解，所以不能继承，报错
//class Child:Parent

open class Parent1 {

    constructor(name: String)

}

class Child : Parent1 {
    constructor(name: String) : super(name)
}