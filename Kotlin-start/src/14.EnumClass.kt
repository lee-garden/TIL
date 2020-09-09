// 코틀린에서의 Enum 클래스는 기본적으로 자바 Enum 처럼 쓰면 된다.
enum class State {
    IDLE, RUNNING, FINISHED
}

// Enum 안에 함수 선언도 가능 하다!!
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}


fun main() {
    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
}