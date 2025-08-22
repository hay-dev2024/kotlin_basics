// 2025.08.22
package exceptions

//fun divide(a: Int, b: Int): Int {
//    if (b == 0) {
//        throw IllegalArgumentException("0으로 나눌 수 없다.")
//    }
//    return a / b
//}

// 함수형 예외처리
//fun parseInt(str: String): Int? {
//    return try {
//        str.toInt()
//    } catch (e: NumberFormatException) {
//        null
//    }
//}

// sealed class 예외처리
//sealed class Result
//data class Success(val result: Int): Result()
//data class Failure(val errorMessage: String): Result()
//
//fun safeDivide(a: Int, b: Int): Result {
//    return if (b == 0) {
//        Failure("0으로 나눌 수 없다")
//    } else {
//        Success(a / b)
//    }
//}

// 예제 2
fun parseInt(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// 예제 4: 부모클래스인 Exception에 메세지를 매개변수로 전달해서 부모클래스에서 message를 처리한다
class InvalidAgeException(message: String): Exception(message)

fun main() {
    // sealed class 예외처리
//    val result = safeDivide(10, 0)
//
//    when (result) {
//        is Success -> println("성공 결과: ${result.result}")
//        is Failure -> println("실패: ${result.errorMessage}")
//    }

//    try {
//        val result = 10 / 0
//        println("결과: $result")
//    } catch (e: ArithmeticException) {
//        println("예외 발생: ${e.message}")
//    } finally {
//        println("예외 처리 종료")
//    }

//    try {
//        println(divide(10, 0))
//    } catch (e: IllegalArgumentException) {
//        println("예외 발생: ${e.message}")
//    }

    // 함수형 예외처리
//    val num = parseInt("123a")
//    if (num != null) {
//        println("숫자: $num")
//    } else {
//        println("숫자로 변환될 수 없다.")
//    }

    // 예제 1
//    print("첫번째 숫자 입력: ")
//    val n1: Int = readLine()!!.toInt()
//    print("두번째 숫자 입력: ")
//    val n2: Int = readLine()!!.toInt()
//
//    try {
//        val result = n1 / n2
//        println("결과: $result")
//    } catch (e: ArithmeticException) {
//        println("예외 발생: ${e.message}")
//    } finally {
//        println("예외 처리 종료")
//    }

    // 예제 2
//    val n = parseInt("321ㅇㄴㅁ")
//    if (n != null) {
//        println(n)
//    } else {
//        println("올바른 값을 입력하시오.")
//    }

    // 예제 3
//    val arr = arrayOf(1,2,3,4,5)
//    print("인덱스 입력: ")
//    val idx = readLine()!!.toInt()
//
//    try {
//        val element = arr[idx]
//        println(element)
//    } catch (e: IndexOutOfBoundsException) {
//        println("예외 발생: ${e.message}")
//    }

    // 예제 4
//    print("나이 입력: ")
//    val age = readLine()!!.toInt()
//
//    try {
//        if (age < 0 || age > 150 ) {
//            throw InvalidAgeException ("올바른 나이를 입력하시오.")
//        } else {
//            println("나이: $age")
//        }
//    } catch (e: InvalidAgeException) {
//        println("예외 : ${e.message}")
//    }

    // 예제 5
//    val arr = arrayOf(1,2,3,4,5)
//    print("숫자 입력: ")
//    val num: Int? = readLine()!!.toIntOrNull()
//
//    try {
//        val idx = num ?: throw NumberFormatException("숫자를 입력하시오")
//        println(arr[idx])
//    } catch (e: NumberFormatException) {
//        println("예외 발생: ${e.message}")
//    } catch (e: IndexOutOfBoundsException) {
//        println("예외 발생: ${e.message}")
//    } finally {
//        println("작업 종료")
//    }

    // 예제 6
    val result = safeDivide(5, 0)
    when (result) {
        is Success -> println("나눗셈 결과: ${result.result}")
        is Failure -> println("나눗셈 실패: ${result.errorMessage}")
    }

}

// 예제 6
sealed class DivideResult
data class Success(val result: Int): DivideResult()
data class Failure(val errorMessage: String): DivideResult()

fun safeDivide(a: Int, b: Int): DivideResult {
    return if (b == 0) {
        Failure("0으로 나눌 수 없다.")
    } else {
        Success(a / b)
    }
}