data class User(val name: String, val id: Int)

fun main() {
    val user = User("garden", 1)
    println(user)

    val secondUser = User("garden",1)
    val thirdUser = User("gardeny",2)
    
    //data class로 만들면 알아서 값으로 비교를 해준다.
    println("user == secondUser : ${user == secondUser}")
    println("user == thirdUser : ${user == thirdUser}")

    println(user.hashCode())
    println(thirdUser.hashCode())

    // copy 메소드를 통해 값 복사를 할 수 있다.
    println(user.copy())
    println(user.copy("new"))
    println(user.copy(id=2))

    // component function은 선언된 props의 순서대로 나타내 준다.
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")


}