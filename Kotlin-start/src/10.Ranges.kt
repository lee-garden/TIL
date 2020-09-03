fun main() {

    // integer, character 동일하게 적용!!!
    // 0 ~ 3 까지 찍힌다.
    for (i in 0..3) {
        println(i)
    }
    println(" ")

    // 2, 4, 6, 8 찍힌다.
    for (i in 2..8 step 2) {
        println(i)
    }
    println(" ")

    // 3부터 아래로 찍힌다.
    for (i in 3 downTo 0) {      // 3
        println(i)
    }
    print(" ")
}