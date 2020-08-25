fun main() {
    // 확장 함수를 중위 표현 으로 사용 가능 하다.
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    // 코틀린은 두 개의 객체를 담을 수 있는 클래스인 Pair가 있다.
    // pair는 두 객체 사이에 to 라는 메소드를 중위 표현 방법 으로 사용 하여 만들 수 있다.
    val pair1 = "Kotlin" to "Java"
    println(pair1)

    // Pair 클래스에 들어가는 객체의 자료형은 상관 없다.
    val pair2 = pair1 to "C++"
    println(pair2)

    // infix 확장 메소드를 이용 하여 Pair 클래스를 만드는 함수
    infix fun String.makePair(other: String) = Pair(this, other)
    val myPair = "McLaren" makePair "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")

    // sophia의 좋아 하는 사람 목록에 claudia 를 추가.
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }
}