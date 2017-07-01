package com.xingfeng_coder.chapter_2

/**
 * Created by Xingfeng on 2017-07-01.
 */
class Rectangle(val height: Int, val width: Int) {

    val isSquare: Boolean
        get() = height == width

}