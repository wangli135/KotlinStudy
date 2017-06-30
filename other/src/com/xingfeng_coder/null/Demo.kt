package src.com.xingfeng_coder.`null`

import javax.xml.soap.Node

/**
 * Created by Xingfeng on 2017-06-30.
 */

/**
 * Elvis操作符与return、throw配合使用
 */
fun foo(node: Node): String? {

    val parent = node.parentNode ?: return null
    val name = node.nodeName ?: throw IllegalArgumentException("name expected")
    return name

}


fun main(args: Array<String>) {

    //不可以指向null
    var a: String = "abc"
//    a=null   //编译错误

    //可以指向null，？
    var b: String? = "abc"
    b = null

    val l = a.length

//    val l2 = b.length

    //检查是否为null
    val l3 = if (b != null) b.length else -1

    if (b != null && b.length > 0) {
        print("String of length ${b.length}")
    } else {
        print("Empty String")
    }

    //安全调用
    val l4 = b?.length

    //安全调用与let一起使用
    val listWithNulls: List<String?> = listOf("Hello", null)
    for (item in listWithNulls)
        item?.let { print(it) }


    val l5 = b?.length ?: -1

    val l6 = b!!.length

    //安全的类型转换
    val aInt: Int? = a as? Int

    //可空类型的集合，filterNotNull过滤
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()

}