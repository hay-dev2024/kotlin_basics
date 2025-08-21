// 2025.08.21
package lib

// method chaining
//data class Person(val name: String, val age: Int)

fun main() {
    // listOf() - 리스트 생성, filter(), forEach()
//    val names = listOf("김철수", "이영희", "김영수", "박민수")
//    val kimList = names.filter { it.startsWith("김") }
//    kimList.forEach { println(it) }

    // method chaining
//    val people = listOf(
//        Person("james", 30),
//        Person("alice", 25),
//        Person("david", 35)
//    )
//    val mapped = people
//        .filter { it.age >= 30 }
//        .map { it.name.uppercase() }
////    println(mapped)
//    mapped.forEach { println(it) }

    // null safety
//    val name: String? = "신짱구"
//    name?.let{
//        println("이름은 $it")
//    }
    // Elvis 연산자
//    val input: String? = null
//    val name = input ?: "기본값"
//    println(name)
//
//    // !!
//    val mustNotNull: String? = null
//    println(mustNotNull!!) // 예외 발생

    // 범위와 반복문
//    for (i in 1..100) {
//        println(i)
//    }

//    for (i in 10 downTo 0 step 2) {
//        println(i)
//    }

    // 확장 함수
//    val text = "Hello1111111111111111111"
//    println(text.isNotBlankAndShort())

    // 스코프 함수 & 메소드 체이닝
//    val user = User("신짱구", 5).apply {
//        age += 1
//        name = name.uppercase()
//    }.also {
//        println("User 객체 구성 완료: $it")
//    }
//    println(user)

    // repeat()
//    repeat(3) {
//        println("반복: $it")
//    }

    // check()
//    val isLoggedIn = false
//    check(isLoggedIn) {"사용자가 로그인되어 있지 않습니다."}
//    println("로그인 상태입니다.")

    // require()
    setEmail("test@mail.com")
    setEmail("321312312")

}

// require()
fun setEmail(email: String) {
    require(email.contains("@")) {"유효하지 않은 이메일 형식입니다."}
    println("이메일이 설정되었습니다: $email")
}

// 스코프 함수
//data class User(var name: String, var age: Int)

// 확장 함수
//fun String.isNotBlankAndShort(): Boolean {
//    return this.isNotBlank() && this.length < 10
//}