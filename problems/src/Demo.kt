/**
 * Created by Xingfeng on 2017-06-28.
 */
fun indexOfMax(a: IntArray): Int? {

    if (a == null)
        return null

    var maxIndex: Int? = null
    var max: Int? = null
    for (i in a.indices) {

        if (max == null || max < a[i]) {
            max = a[i]
            maxIndex = i
        }

    }
    return maxIndex


}

fun isPalindrom(s: String): Boolean {

    var result = true

    val data = s.toCharArray()
    val len = s.length

    for (i in 0..len / 2) {

        if (data[i] != data[len - i - 1]) {
            result = false
            break
        }

    }


    return result


}

fun main(args: Array<String>) {




}