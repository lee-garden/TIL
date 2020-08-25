fun main() {
    printAll("Hello", "Hallo", "안녕")
    printAllWithPrefix("Hello", "Hallo", "안녕", prefix = "[Greeting] : ")
    log("Hello", "Hallo", "안녕")
}


// vararg 는 가변 인자 를 뜻 한다.
fun printAll(vararg  messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
    for (m in messages) println(prefix + m)
}

fun log(vararg messages: String) {
    printAll(*messages)
}