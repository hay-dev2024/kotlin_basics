// 2025.08.19

fun main() {
    val p1 = Person("신짱구", 5)
    p1.greet()
    val book1 = Book("코틀린 인 액션", 48000)
    book1.info()

}

class Person(val name: String, var age: Int) {
    init {
        println("사람 객체가 생성됨: $name, $age 세")
    }
    fun greet() {
        println("안녕 난 뽀로로야, 넌 $name 이구나!")
    }
}

class Book (val title: String, val price: Int) {
    fun info() {
        println("책 정보: $title, $price 원")
    }
}
