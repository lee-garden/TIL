fun main() {

    // 1. for in 절
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println(cake)
    }

    // 2. while
    var i =0
    while (i<5) {
        println("i = $i")
        i++
    }

    // 3. iterator
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    val iterator = zoo.iterator()

    while(iterator.hasNext()) {
        println(iterator.next().name)
    }
}

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    // iterator 정의는 메소드 명은 iterator, operator 키워드를 붙여야 한다.
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}