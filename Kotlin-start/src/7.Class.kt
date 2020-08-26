/**
 * 선언만으로 클래스를 만든다.
 * Customer 클래스는 멤버 변수를 갖지 않으며
 * 기본 생성자를 갖고 있는 클래스 이다.
 * */
class Customer


/**
 * Contact 객체의 id는 한번 설정 되면 바뀌지 않는다.
 * */
class Contact(val id: Int, var email: String)


/**
 * Generic type을 이용한 스택 만들기
 * */
class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size(): Int = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

open class Dog {
    open fun sayHello() {
        println("멍멍!")
    }
}

class Pomeranian : Dog() {
    override fun sayHello() {
        println("포메: 멍멍!")
    }
}


fun main() {
    //==========기본 클래스============//
    val customer = Customer()
    val contact = Contact(1, "khjvvv7@gmail.com")
    println(contact.id)

    //==========Generic============//
    var myStack = MutableStack(1, 2)
    println(myStack)

    //==========상속============//
    val dog: Dog = Pomeranian()
    dog.sayHello()
}
