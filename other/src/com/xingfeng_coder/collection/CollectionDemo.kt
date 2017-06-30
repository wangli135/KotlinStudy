package com.xingfeng_coder.declaration

/**
 * Created by Xingfeng on 2017-06-29.
 */
fun main(args: Array<String>) {

    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = numbers
    println(numbers)  // 输出 [1,2,3]
    numbers.add(4)
    println(readOnlyView)   //输出 [1,2,3,4]
//    readOnlyView.clear()   //错误
    val strings = hashSetOf<String>("a", "b", "c", "c")
    assert(strings.size == 3)

    //创建不可变list
    val items = listOf(1, 2, 3)
    println(items.first() == 1)
    println(items.last() == 3)
    items.filter {
        it % 2 == 0
    }.forEach {
        println("$it")
    }

    val rwList = mutableListOf(1, 2, 3)
    rwList.requireNoNulls()    //返回[1,2,3]
    if (rwList.none { it > 6 }) println("No items above 6")
    val item = rwList.firstOrNull()



    val rwMap = hashMapOf("foo" to 1, "bar" to 2)
    println(rwMap["foo"])
    val snapshot: Map<String, Int> = HashMap(rwMap)



}