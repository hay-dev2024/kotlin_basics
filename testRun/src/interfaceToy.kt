// 2025.08.21
interface Toy {
    fun movements()
}

interface Missile: Toy {
    override fun movements() {
        println("미사일 발사 가능합니다")
        println("===================================")
    }
}

interface ArmLeg: Toy {
    override fun movements() {
        println("팔다리를 움직일 수 있습니다.")
        println("===================================")
    }
}

interface Light: Toy {
    override fun movements() {
        println("불빛 발사 가능합니다.")
        println("===================================")
    }
}

class Poohlmpl(val name: String): ArmLeg {
    init {
        println("$name 입니다.")
    }
}

class Mazingerlmpl(val name: String): Missile, ArmLeg {
    init {
        println("$name 입니다.")
    }
    override fun movements() {
        println("미사일 발사 가능합니다")
        println("팔다리를 움직일 수 있습니다.")
        println("===================================")
    }
}

class Airplanelmpl(val name: String): Missile, Light {
    init {
        println("$name 입니다.")
    }
    override fun movements() {
        println("불빛 발사 가능합니다.")
        println("미사일 발사 가능합니다")
        println("===================================")
    }
}

fun main() {
    val t1: Toy = Airplanelmpl("비행기")
    t1.movements()

    val t2: Toy = Mazingerlmpl("마징가")
    t2.movements()

    val t3: Toy = Poohlmpl("곰돌이")
    t3.movements()
}