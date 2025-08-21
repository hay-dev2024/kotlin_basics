// 2025.08.20

//fun main() {
//    var child = Child() // 인스턴스화
//    child.sayHello()
//    child.myHello()

    // 오버라이딩
//    val parent = Parent()
//    val child = Child()
//    parent.sayHello()
//    child.sayHello()

    // super 키워드
//    val animal = Animal()
//    val dog = Dog()
//    animal.makeSound()
//    dog.makeSound()

    // 프로퍼티 오버라이딩
//    val s = Student()
//    s.introduce()

    // 데이터 클래스
//    val u1 = User("신짱구", 5)
//    val u2 = u1.copy(age = 35)
//
//    println(u1)
//    println(u2)
//    println(u1 == u2)
//    // 객체 주소값 출력
//    println(System.identityHashCode(u1))
//    println(System.identityHashCode(u2))

    // 봉인 클래스
//    handleResult(Success("회원가입 완료"))
//    handleResult(Failure("네트워크 에러"))
//    handleResult(Loading)

    // 봉인 클래스 - 추상 메소드 정의
//    val car = Car()
//    car.move()
//    val train = Train()
//    train.move()

    // 클래스 확장 - 문자열
//    val name = "신짱구"
//    println(name.addPrefix("유치원생 "))

    // 클래스 확장 - 정수
//    println(10.isEven())
//    println(5.isEven())

    // 예제 3
//    println(4.isOdd())
//    println(7.isOdd())
//
//    // 예제 4
//    val book1 = Book("그리고 아무도 없었다", "아가사 크리스티")
//    val book2 = book1.copy()
//    println(book1)
//    println(book2)
//    println(System.identityHashCode(book1))
//    println(System.identityHashCode(book2))
//
//    // 예제 5
//    val car = Car()
//    car.move()
//    car.crash()
//    val train = Train()
//    train.move()
//    train.crash()
//    val airplane = Airplane()
//    airplane.move()
//    airplane.crash()

//}

// 예제 5
//sealed class Transport {
//    abstract fun move()
//    abstract fun crash()
//}
//
//class Car: Transport() {
//    override fun move() = println("안녕 난 자동차야 부릉부릉~")
//    override fun crash() = println("자동차 충돌! 꽝!!")
//}
//
//class Train: Transport() {
//    override fun move() = println("안녕 난 기차야 칙칙폭폭~")
//    override fun crash() = println("기차 충돌! 콰광!!")
//}
//
//class Airplane: Transport() {
//    override fun move() = println("안녕 난 비행기야 윙윙~")
//    override fun crash() = println("비행기 충돌! 꽈과광!!!")
//}
//
//fun handleTransport(t: Transport) {
//    when (t) {
//        is Car -> t.move()
//        is Train -> t.move()
//        is Airplane -> t.move()
//    }
//}


// 예제 4
//data class Book(val title: String, val author: String)

// 예제 3
//fun Int.isOdd(): Boolean = this % 2 != 0

// 클래스 확장 - 정수
//fun Int.isEven(): Boolean = this % 2 == 0

// 클래스 확장 - 문자열
//fun String.addPrefix(prefix: String): String {
//    return "$prefix$this"
//}

// 봉인 클래스 - 추상 메소드 정의
//sealed class Transport {
//    abstract fun move()
//}
//
//class Car: Transport() {
//    override fun move() = println("자동차 이동")
//}
//
//class Train: Transport() {
//    override fun move() = println("기차 이동")
//}
//
//fun handleTransport(t: Transport) {
//    when (t) {
//        is Car -> t.move()
//        is Train -> t.move()
//    }
//}

// 봉인 클래스
//sealed class ApiResult
//    data class Success(val data: String): ApiResult()
//    data class Failure(val error: String): ApiResult()
//    object Loading: ApiResult()
//
//fun handleResult(result: ApiResult) {
//    when (result) {
//        is Success -> println("성공: ${result.data}")
//        is Failure -> println("실패: ${result.error}")
//        Loading -> println("로딩 중...")
//    }
//}

// 데이터 클래스
//data class User(val name: String, val age: Int)

// val을 var로 오버라이딩 가능
//open class Animal {
//    open val name: String = "동물"
//}
//
//class Dog: Animal() {
//    override var name: String = "강아지"
//}
//
//// 프로퍼티 오버라이딩
//open class Person {
//    open val type: String = "사람"
//
//    open fun introduce() {
//        println("난 $type 이야.")
//    }
//}
//
//class Student: Person() {
//    override val type: String = "학생"
//}

// super 키워드
//open class Animal {
//    open fun makeSound() {
//        println("동물이 소리를 내!")
//    }
//}
//
//class Dog: Animal() {
//    override fun makeSound() {
//        super.makeSound()
//        println("멍멍!!!")
//    }
//}

// 오버라이딩
//open class Parent {
//    open fun sayHello() {
//        println("안녕, 난 부모야")
//    }
//}
//
//class Child: Parent() {
//    override fun sayHello() {
//        println("안녕, 난 자식이야")
//    }
//}

// 상속
//open class Parent {
//    var hello: String = "안녕"
//    fun sayHello() {
//        println("상속: $hello")
//    }
//}
//
//class Child: Parent() {
//    fun myHello() {
//        hello = "Hello" // 부모 클래스의 변수 hello 이다
//        sayHello()
//    }
//}
