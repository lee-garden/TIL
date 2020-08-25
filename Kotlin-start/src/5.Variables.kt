fun main() {

    // var : mutable
    var a: String = "Hello"

    // val : immutable
    val b: Int = 1
    val c = 3

    // val 변수는 선언과 동시에 초기화 하지 않아도 된다.
    // 최초 할당 된 값이 유지 된다.
    val d: Int
    val boo = true
    if (boo) {
        d = 1
    } else {
        d = 2
    }

    println(d)

}