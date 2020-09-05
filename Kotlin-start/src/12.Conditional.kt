/**
 * 코틀린에는 삼항 연산자가 없다!!
 * */
fun main() {
    println(max(99, -42))
}

fun max(a: Int, b: Int) = if (a > b) a else b