fun main() {
    printMessage("print this message!")

    // [Info] Hello 출력 - default 값이 출력 된다.
    printMessageWithPrefix("Hello")

    // [Log] Hello 출력
    printMessageWithPrefix("Hello", "Log")

    // 선언된 파라미터의 순서도 바꿔서 출력 할 수 있다.
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    println(sum(1, 2))

}

// Unit 타입은 void 와 같은 역할을 한다.
fun printMessage(message: String): Unit {
    println(message)
}

/**
 * 변수를 print 할 때는 변수 앞에 '$'를 붙여 준다.
 * 파라미터를 선언 할 때 넘어 오지 않을 경우 default 값을 설정 할 수 있다.
 * */
fun printMessageWithPrefix(message: String, prefix: String="Info") {
    println("[$prefix] $message")
}

// 기본 적인 함수 사용
fun sum(x: Int, y: Int): Int {
    return x + y
}