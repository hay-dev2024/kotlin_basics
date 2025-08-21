//2025.08.21

// object - 프로그램 내에서 공용으로 사용할 것, 싱글톤 객체 만들때 사용

object MathUtil {
    fun add(a: Int, b: Int): Int = a + b
    fun square(x: Int): Int = x * x
}

class Pig {
    companion object {
        var name: String = "None"
        fun printName() {
            println("Pig 이름은 $name 이다.")
        }
    }
}

fun main() {
    println(MathUtil.add(3, 5))
    println(MathUtil.square(3))

    Pig.name = "꿀꿀돼지"
    Pig.printName()
}