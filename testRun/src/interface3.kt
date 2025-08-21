//// 2025.08.21
//
//interface Bluetooth {
//    fun connectBluetooth()
//}
//
//interface Wifi {
//    fun connectWifi()
//}
//
//class SmartPhone: Bluetooth, Wifi {
//    override fun connectBluetooth() {
//        println("블루투스 연결")
//    }
//
//    override fun connectWifi() {
//        println("와이파이 연결")
//    }
//}
//
//interface Remote {
//    fun turnOn() {
//        println("기본 전원 켜기")
//    }
//    fun turnOff()
//}
//
//class TVRemote: Remote {
//    override fun turnOff() {
//        println("TV 전원 끄기")
//    }
//}
//fun main() {
//    val phone = SmartPhone()
//    phone.connectWifi()
//    phone.connectBluetooth()
//
//    val remote: Remote = TVRemote()
//    remote.turnOn()
//    remote.turnOff()
//}