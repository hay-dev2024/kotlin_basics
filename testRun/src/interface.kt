//// 2025.08.21
//interface Machine {
//    fun start()
//    fun stop()
//}
//
//class Car: Machine {
//    override fun start() {
//        println("자동차 시동을 켭니다")
//    }
//    override fun stop() {
//        println("자동차 시동을 끕니다")
//    }
//}
//
//class Bike: Machine {
//    override fun start() {
//        println("오토바이 시동을 켭니다")
//    }
//    override fun stop() {
//        println("오토바이 시동을 끕니다")
//    }
//}
//
//fun operateMachine(machine: Machine) {
//    machine.start()
//    machine.stop()
//}
//
//fun main() {
//    val car = Car()
//    operateMachine(car)
//
//    val bike = Bike()
//    operateMachine(bike)
//
//}