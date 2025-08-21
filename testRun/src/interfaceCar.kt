// 2025.08.21
// 추상클래스
abstract class StarCar {
    abstract val color: String
    abstract val tire: String
    abstract val displacement: Int
    abstract val handle: String

    abstract fun getSpec()
}

// 세금 계산 함수
object CarSpecs {
    fun carSpecs(displacement: Int): Int {
        if (displacement > 2000) {
            return 2000
        } else {
            return 1000
        }
    }
}

class StarCarLowGrade: StarCar() {
    override val color: String = "블루"
    override val tire: String = "일반타이어"
    override val displacement: Int = 2000
    override val handle: String = "파워핸들"

    override fun getSpec() {
        val tax = CarSpecs.carSpecs(displacement)

        println("[StarCar 저사양 옵션 및 세금]")
        println("-----------------------------")
        println("색상: $color")
        println("타이어: $tire")
        println("배기량: $displacement")
        println("핸들: $handle")
        println("세금: $tax")
        println()
    }
}

class StarCarHighGrade: StarCar() {
    override val color: String = "레드"
    override val tire: String = "광폭타이어"
    override val displacement: Int = 2200
    override val handle: String = "파워핸들"

    override fun getSpec() {
        val tax = CarSpecs.carSpecs(displacement)

        println("[StarCar 고사양 옵션 및 세금]")
        println("-----------------------------")
        println("색상: $color")
        println("타이어: $tire")
        println("배기량: $displacement")
        println("핸들: $handle")
        println("세금: $tax")
        println()
    }
}

fun main() {
    val lowCar = StarCarLowGrade()
    lowCar.getSpec()

    val highCar = StarCarHighGrade()
    highCar.getSpec()
}