// 2025.08.21

interface Engine {
    fun startEngine()
}

class GasEngine: Engine {
    override fun startEngine() {
        println("가솔린 엔진 시동 걸기!")
    }
}

class ElectricEngine: Engine {
    override fun startEngine() {
        println("전기 엔진 시동 걸기!")
    }
}

class Car(val engine: Engine) {
    fun start() {
        engine.startEngine()
    }
}

fun main() {
    val myCar: Engine = GasEngine()
    myCar.startEngine()

    val myCar2: Engine = ElectricEngine()
    myCar2.startEngine()

}