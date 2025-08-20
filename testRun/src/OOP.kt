// 2025.08.19 ~ 08.20

//fun main() {
//    val p1 = Person("신짱구", 5)
//    p1.greet()
//    val book1 = Book("코틀린 인 액션", 48000)
//    book1.info()
//
//    val student1 = Student("철수", 5)
//    val person1 = Person1("뽀로로", 6)
//    val person = Person()
//    person.process()
//
//    val company = Company()
//    company.process()

    // 예제 4
//    val memeber1 = Members("신짱구", "schan", "1234", 5, "010-1234-5678", "서울")
//    val memeber2 = Members("철수", "chul", "5678")
//    memeber2.phone = "010-0000-1111"
//    memeber2.addr = "대구"
//    memeber2.age = 6
//    println("멤버 2의 정보 - 이름: ${memeber2.name} ID: ${memeber2.id} PW: ${memeber2.pw} 나이: ${memeber2.age} 전화번호: ${memeber2.phone} 주소: ${memeber2.addr}")
//}

// Primary Constructor
//class Person(val name: String, var age: Int) {
//    init {
//        println("사람 객체가 생성됨: $name, $age 세")
//    }
//    fun greet() {
//        println("안녕 난 뽀로로야, 넌 $name 이구나!")
//    }
//}

//class Book (val title: String, val price: Int) {
//    fun info() {
//        println("책 정보: $title, $price 원")
//    }
//}

// Secondary Constructor
// 클래스 변수를 초기화하거나, constructor(): this() 키워드를 사용해야 빌드 에러가 발생하지 않는다
// 자바에서는 굳이 클래스 변수를 초기화 하지 않아도 되지만, 코틀린에서는 초기화를 해야한다...
//class Student {
//    var name: String
//    var age: Int
//    constructor(name: String): this(name, age = 0) {
//        this.name = name
//    }
//    constructor(name: String, age: Int) {
//        this.name = name
//        this.age = age
//    }
//}

// Properties
//class Person2 {
//    var name = "철수"
//    val age = 30
//}
//
//class Person3(val name: String, val age: Int)

// lateinit: 선언만 하고 init 블록에서 초기화
//class Person1(name: String, age: Int) {
//    lateinit var name: String
//    var age: Int = 0
//
//    init {
//        this.name = name
//        this.age = age
//    }
//}
//class Person {
//    lateinit var name: String
//    init {
//        name = "홍"
//    }
//    fun process() {
//        name = name.plus("길동")
//        println("이름은 $name, 길이는 ${name.length}")
//        println("이름의 첫글자는 ${name.substring(0,1)}")
//    }
//}

// lazy
//class Company {
//    val person: Person by lazy { Person() }
//    init {}
//    fun process() {
//        println("person 이름: ${person.name}") // 최초 호출 시점에 초기화된다
//    }
//}
//
//// 예제 4
//class Members(val name: String, val id: String, val pw: String) {
//    var age: Int = 0
//    var phone: String = ""
//    var addr: String = ""
//
//    constructor (name: String, id: String, pw: String, age: Int, phone: String, addr: String) : this(name, id, pw) {
//        this.age = age
//        this.phone = phone
//        this.addr = addr
//        println("나이 : $age, 전화번호: $phone, 주소: $addr")
//    }
//
//    init {
//        println("멤버가 생성됨")
//        println("이름: $name, ID: $id, Password: $pw")
//    }
//}