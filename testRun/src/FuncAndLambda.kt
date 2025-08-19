// 2025.08.19

fun main() {
//    var result = sum(10, 20)
//    println(result)
//    result = mult(2, 3)
//    println(result)

    // 입력받은 숫자가 짝수인지 홀수인지 판별하는 함수
//    print("숫자 입력: ")
//    val num = readLine()!!.toInt()
//    println(evenOrOdd(num))

    // 반환값이 없는 함수
//    printSum(100,200)
//    printSum2(100, 200)

    // 매개변수 기본값을 사용하는 함수
//    funEx01(name = "신짱구", age = 5)

    // vararg 매개변수를 사용하는 함수
//    printAll("안녕", "난 뽀로로야!", "너는 누구니?")
//    printInt(1,2,3,4,5)

    // 가변인자 *(spread operator)를 사용하는 함수
//    val arr = arrayOf("내 이름은", "신짱구", "5살이지") // arrayOf 생성자를 이용하여 배열을 생성. 이렇게 생성된 배열의 주솟값을 arr에 넘긴다
//    printAll(*arr) // * 를 사용하여 배열을 가변인자로 전달

    // 가변인자와 고정 매개 변수를 같이 사용하는 함수
//    greet("안녕", "짱구", "철수", "유리", "맹구")
//    callEx("마지막 메세지", 1,2,3,4,5)
//    callEx(1,2,3,4,5, message = "마지막 메세지")


    // 람다식/함수 Lambda
//    val sum = { x: Int, y: Int -> x + y }
//    val squre = { x: Int -> x * x }
//    val mult = { x: Int, y: Int -> x * y }
//    println(sum(10, 20))
//    println(squre(2))
//    println(mult(2, 5))

    // 매개변수가 없는 람다식
//    val out = { println("Hello, Kotlim Lambda") }
//    out()

    // run 함수를 사용하여 람다식을 실행할 수 있다
//    run { println(42) }

    // 고차함수: 람다를 파라미터로 받는 함수
//    println(highFunc({x, y -> x + y}, 10, 20))
//    println(highFunc2({x -> x * x}, 3))
//    println(highFunc3({ x, y -> x * y }, 2, 3 ))

    // 람다식 이용: 사칙연산하기 - 함수는 1개를 만들고, 람다식을 4개 만들어서 사칙연산 수행
//    val sum = calculator(10, 5) {a, b -> a + b}
//    val sub = calculator(10, 5) {a, b -> a - b}
//    val mult = calculator(10, 5) {a, b -> a * b}
//    val divi = calculator(10, 5) {a, b -> a / b}
//
//    println("덧셈 결과: $sum")
//    println("뺄셈 결과: $sub")
//    println("곱셈 결과: $mult")
//    println("나눗셈 결과: $divi")

    // 람다식 이용: 파라미터 없는 람다를 받는 함수
//    runTwice { println("한 번 더!") }


    // 예제 1
    val result = sum(3, 2) { x, y -> x + y }
    println(result)

    // 예제 2
    val str = returnStr("바나나우유") {s -> s}

    // 예제 3
    val result2 = avgFunc(5.0f, 100.0f, 90.0f, 80.0f)
    println("결과: $result2")

    // 예제 6: 한 개의 Int 타입 매개 변수를 입력 받아 짝수면 true, 홀수면 false를 리턴하는 조건문을 활용한 단일 표현식 함수(isEven)을 작성하시오.
    println("숫자 입력: ")
    var n = readLine()!!.toInt()
    val result3 = isEven(2) { n: Int -> n % 2 == 0 }
    println(result3)
}

// 예제 6
fun isEven( n: Int, oddOrEven: (Int) -> Boolean): Boolean = oddOrEven(n)




// 예제 3
fun avgFunc(initial: Float = 0.0f, vararg numbers: Float): Double {
    var result = 0f
    var sum: Double = 0.0
    var cnt: Int = 0

    for (num in numbers) {
        cnt++
        sum += num
    }

    sum += initial
    var avg: Double = sum / (cnt + 1)
    return avg
}


// 예제 2
fun returnStr(s: String, pritnStr: (String) -> String): Unit {
    println(pritnStr(s))
}

// 예제 1
fun sum (a: Int, b: Int, nr: (Int, Int) -> Int): Int = nr(a, b)


// 람다식 이용: 파라미터 없는 람다를 받는 함수
fun runTwice(action: () -> Unit) {
    action()
    action()
}

// 람다식 이용: 사칙연산하기
fun calculator(x: Int, y: Int, op: (Int, Int) -> Int): Int = op(x, y)

// 고차함수: 람다를 파라미터로 받는 함수
fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b)

fun highFunc2(squre: (Int) -> Int, a: Int) : Int {
    return squre(a)
}

fun highFunc3(mult: (Int, Int) -> Int, a: Int, b: Int): Int = mult(a, b)

// 가변인자와 고정 매개 변수를 같이 사용하는 함수
fun greet(greeting: String, vararg names: String) {
    for (name in names) {
        println("$greeting, $name!")
    }
}
// vararg는 마지막 매개변수로 사용하는 것이 원칙
fun callEx(vararg values: Int, message: String) {
    println("message: $message")
    println("values: ${values.joinToString()}")
    println("sum: ${values.sum()}")
}


// 가변인자 *(spread operator)를 사용하는 함수
fun printAll(vararg messages: String) {
    for (msg in messages) {
        println(msg)
    }
}

// vararg 매개변수를 사용하는 함수
//fun printAll(vararg messages: String) {
//    for (msg in messages) {
//        println(msg)
//    }
//}
//
//fun printInt(vararg numbers: Int) {
//    for (n in numbers) {
//        println(n)
//    }
//}

// 매개변수 기본값을 사용하는 함수
fun funEx01(age: Int = 25, name: String, weight: Double = 72.5) {
    println("name: $name, age: $age, weight: $weight")
}

// 일반 함수
fun sum(a: Int, b: Int): Int {
    return  a + b
}

// 단일 표현식 함수
fun mult(a: Int, b: Int): Int = a * b

// 홀짝 판별 함수
fun evenOrOdd(n: Int): String = if (n % 2 == 0) "짝수" else "홀수"

// 반환값이 없는 함수
fun printSum(a: Int, b: Int) {
    println("$a 와 $b 의 합: ${a + b}")
}
// 단일 표현식 함수로 반환값이 없는 함수
fun printSum2(a: Int, b: Int) = println("$a + $b = ${a + b}")

