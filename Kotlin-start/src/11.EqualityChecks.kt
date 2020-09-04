fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    // == 비교는 equals 메소드를 수행 한다. 그래서 true가 나온 것.
    println(authors == writers)

    // === 비교는 주소값 비교를 한다. 다른 객체 이기 때문에 false가 나온것.
    println(authors === writers)
}