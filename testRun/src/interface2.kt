//// 2025.08.21
//interface Device {
//    val modelName: String
//    fun powerOn()
//}
//
//class Phone(override val modelName: String): Device {
//    override fun powerOn() {
//        println("$modelName 전원이 켜졌습니다")
//    }
//}
//
//fun main() {
//    val myPhone: Device = Phone("iPhone 11 Pro")
//    println(myPhone.modelName)
//    myPhone.powerOn()
//}