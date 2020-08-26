fun main() {

    var neverNull: String = "This can't be null"
    // neverNull = null   => 컴파일 에러 난다.

    var nullable: String? = "This can be null"
    nullable = null

    var nonNull = "null?"
    //nonNull = null    =>   별다른 명시가 없으면 null 이 될 수 없다.

    strLength(neverNull)
//    strLength(nullable)  => strLength 메소드의 인자가 nullable 하지 않으므로 컴파일 에러가 난다.
}

fun strLength( notNull: String): Int {
    return notNull.length
}

