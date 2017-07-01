package src.com.xingfeng_coder.interop

import java.util.*

/**
 * Created by Xingfeng on 2017-07-01.
 */
fun demo(source: List<Int>) {

    val list = ArrayList<Int>()
    for (item in source) {
        list.add(item)
    }

    for (i in 0..list.size - 1) {
        println(list[i])
    }


}

fun calendarDemo() {

    val calendar = Calendar.getInstance()
    if (calendar.firstDayOfWeek == Calendar.SUNDAY) {
        calendar.firstDayOfWeek = Calendar.MONDAY
    }

}

fun `is`(bar: Int) {

}

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3)
    demo(list)   //1 2 3

}
