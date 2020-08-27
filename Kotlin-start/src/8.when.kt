fun main() {
    whenTest("Hello")
    whenTest(1)
    whenTest(0L)
    whenTest(MyClass())
    whenTest("hello")

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

/**
 * 코틀린의 when절
 * when() {
 *  조건 -> 수행
 *  조건 -> 수행
 *  else -> 수헹
 * }
 *
 * 조건이 모두 실패 할 시 else로 간다.
 * */
fun whenTest(obj: Any) {
    when(obj) {
        1 -> println("obj is One")
        "Hello" -> println("obj is Hello")
        is Long -> println("Long")
        !is String -> println("Not string")
        else -> println("Unknown")
    }
}

/**
 * when 구문은 조건 절의 결과를 반환 한다.
 * */
fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass
