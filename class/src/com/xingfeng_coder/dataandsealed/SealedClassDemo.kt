package com.xingfeng_coder.dataandsealed

/**
 * Created by Xingfeng on 2017-06-26.
 */
sealed class Expr {
    fun foo() {
        println("Expr.foo")
    }
}

data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {

    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN

//else被忽略，因为覆盖了所有可能性

}
