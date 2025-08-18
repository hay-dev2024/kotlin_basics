import kotlin.random.Random
import kotlin.random.nextInt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // 2025.08.14
//    var num: Double = 0.1;
//
//    for (x in 0..999) {
//        num += 0.1;
//    }
//    println("num: $num");


// == vs. ===
//    var str1: String = "신짱구";
//    var str2 = "철수";
//    var str3 = "신짱구";
//    val str4 = "신짱구";
//
//    println("$str1 == $str2: ${str1 == str2}");
//    println("$str1 == $str3: ${str1 == str3}");
//    println("$str1 === $str4: ${str1 === str4}");


// Null과 null 체크
//    var str1: String?;
//    str1 = null;
//    println("str1: $str1");

    // safe-call(?.) & non-null(!!.)
//    println("str1: ${str1?.length}");
//    println("str1: ${str1!!.length}");

    // 조건문을 이용한 null 체크
//    var strLen = if(str1 == null) "null" else str1.length
//    println("str1: $str1, length: $strLen")

    // 엘비스 연산자(?:)
//    var str2: String? = "Hi, Kotlin"
//    str2 = null
//
//    println("str2: $str2, length: ${str2?.length ?: "null"}")

    // 타입 변환 메소드
//    val a: Int = 10
//    val b: Double = a.toDouble()
//    val c: Int = 1.1.toInt()
//    val d: String = a.toString()
//    val e: Char = c.toChar() // 4바이트인 Int를 2바이트인 Char로 변환하게 되면 값이 깨진다
//
//    println("a = $a")
//    println("b = $b")
//    println("c = $c")
//    println("d = $d")
//    println("e = $e")


    // Number 타입 스마트 캐스트
//    var numEx: Number = 19.9
//    println("numEx - $numEx, type: ${numEx.javaClass}")
//
//    numEx = 19
//    println("numEx - $numEx, type: ${numEx.javaClass}")
//
//    numEx = 19L
//    println("numEx - $numEx, type: ${numEx.javaClass}")
//
//    numEx = 19.9f
//    println("numEx - $numEx, type: ${numEx.javaClass}")

    // is 키워드(데이터 타입 검사)
//    val num = "999"
//
//    if (num is Int) {
//        println("num: $num")
//    } else if (num !is Int) {
//        println("num is not Int")
//    }

    // Any 타입
//    var anyEx: Any = 100
//    println("anyEx: $anyEx, type: ${anyEx.javaClass}")
//
//    anyEx = 200L
//    println("anyEx: $anyEx, type: ${anyEx.javaClass}")
//
//    anyEx = "Hi, Kotlin!"
//    println("anyEx: $anyEx, type: ${anyEx.javaClass}")
//
//    anyEx = true
//    println("anyEx: $anyEx, type: ${anyEx.javaClass}")
//
//    anyEx = 3.14
//    println("anyEx: $anyEx, type: ${anyEx.javaClass}")
//
//    anyEx = 'A'
//    println("anyEx: $anyEx, type: ${anyEx.javaClass}")

    // 2025.08.18
    // Any 타입으로 매개변수 받는 함수
//    anyFunc(100)
//    anyFunc("Hi, Kotlin!")
//    anyFunc(3.14)
//    anyFunc(true)
//    anyFunc('A')

    // as 강제 타입 캐스팅 연산자
//    val obj: Any = "Hello, Kotlin!"
//    val str = obj as String
//    println("str: $str, type: ${str.javaClass}")
//    println("length: ${str.length}")
//
//    val iNum: Any = 100
//    val strVal = iNum as? String
//    println("strVal: $strVal") // Runtime 오류 발생: class java.lang.Integer cannot be cast to class java.lang.String

//    // 예제 1
//    println("Byte: ${Byte.MIN_VALUE}-${Byte.MAX_VALUE}")
//    println("Int: ${Int.MIN_VALUE}-${Int.MAX_VALUE}")
//    println("Short: ${Short.MIN_VALUE}-${Short.MAX_VALUE}")
//    println("Long: ${Long.MIN_VALUE}-${Long.MAX_VALUE}")
//    println("Float: ${Float.MIN_VALUE}-${Float.MAX_VALUE}")
//    println("Double: ${Double.MIN_VALUE}-${Double.MAX_VALUE}")
//
//    // 예제 2
//    val name = "홍길동"
//    println("제 이름은 $name 입니다.")
//
//    // 예제 3
//    var txt1: String? = null
//    println("결괏값이 ${txt1?.length} 입니다.")
//    txt1 = "간결한 언어 Kotlin"
//    println(txt1)
//
//    // 예제 4
//    // steEx01의 length가 출력된다
//    var strEx01: String? = "Hi, Kotlin"
//    println("strEx01: $strEx01, length: ${strEx01?.length ?: "null"}")
//
//    // 예제 5
//    // [1] anyEx: 100, type: Int
//    // [2] anyEx: 200, type: Long
//    // [3] anyEx: Hi, Kotlin!, type: String
//    var anyEx: Any = 100
//    println("[1] anyEx: $anyEx, typpe: ${anyEx.javaClass}")
//
//    anyEx = 200L
//    println("[1] anyEx: $anyEx, typpe: ${anyEx.javaClass}")
//
//    anyEx = "Hi, Kotlin"
//    println("[1] anyEx: $anyEx, typpe: ${anyEx.javaClass}")
//
//    // 예제 6
//    // 발생하는 오류: 런타임 예외가 발생한다
//    // as -> as?
//    //  . -> ?.
//    val obj: Any = "Hello, Kotlin"
//    val str = obj as String
//    println("str: $str, type: ${str.javaClass}")
//    println("length: ${str.length}")
//
//    val iNum: Any = 100
//    val strVal = iNum as? String
//    println("strVal: $strVal, type: ${strVal?.javaClass}")

    // Float -> Double 으로 변환시 주의!
//    var num1: Float = 0.1f
//    var num2: Double = 0.1
//
////    println("resul1 (num1 == num2): ${num1 == num2}")
//    println("result2 (num1.toDouble() == num2): ${num1.toDouble() == num2}")
//    println("result3 (num1 == num2.toFloat()): ${num1 == num2.toFloat()}")

    // if 표현식: if 조건의 결과를 값으로 반환한다
//    val age = 20
//    val category = if (age >= 18) "성인" else "미성년자"
//    println(category)
//
//    val score = 85
//    val grade = if (score >= 90) {
//        "A"
//    } else if (score >= 80) {
//        "B"
//    } else {
//        "C"
//    }
//    println(grade)

    // when 표현식
//    val day = 1
//    val dayName = when (day) {
//        1 -> "월요일"
//        2 -> "화요일"
//        3 -> "수요일"
//        4 -> "목요일"
//        5 -> "금요일"
//        6 -> "토요일"
//        7 -> "일요일"
//        else -> "알 수 없음"
//    }
//    println("오늘은 $dayName")

    // 예제 1
//    val x = 10
//    val y = 5
//    val strRet: String = "x + y = ${x + y}"
//    println(strRet)

    // 예제 2
//    var x = 10
//    var y = 20
//    val z = (++x) + (y--) // 11 + 20
//    println("z = $z")

    // 예제 3
//    val score = 85
//    val result: String = if( !(score < 90) ) "가" else "나" // !(true) = false --> 나
//    println("result: $result")
//
//    // 예제 4
//    val value = 356
//    println("result: $value - ${value%100} = ${value - value%100}")
//
//    // 예제 5
//    val x = 10
//    val y = 5
//    println( (x > 7) && (y <= 5) ) // true && true --> true
//    println( (x % 3 == 2) || (y % 2 != 1 ) ) // false || false --> false
//
//    // 예제 6
//    println(categoryByAge(10)) // 어린이
//    println(categoryByAge(19)) // 청소년
//    println(categoryByAge(25)) // 성인


    // if 표현식
//    var a = 5
//    var b = 3
//    var bigger = if (a > b) {
//        println("a is bigger than b")
//        a
//    } else {
//        println("b is bigger than a")
//        b
//    }
//    println("bigger number is $bigger")

    // in연산자 & 범위연산자
//    print("Enter score: ")
////    val score: Double? = readLine()?.toDouble()
//    // --> score를 Any 타입으로 받아서 타입을 확인한 다음 처리하는 것이 안전하다(예를 들면, 현재 코드에서는 문자열이 입력되면 예외가 발생한다)
////    val score: Any? = readLine()?
//
//
//    var grade: Char = 'F'
//
//    // if (score as Double in 90.0..100.0) {
//    if (score in 90.0..100.0) {
//        grade = 'A'
//    } else if (score in 80.0..89.9) {
//        grade = 'B'
//    } else if (score in 70.0..79.9) {
//        grade = 'C'
//    } else if (score in 60.0..69.9) {
//        grade = 'D'
//    } else {
//        grade = 'F'
//    }
//    println("score: $score, grade: $grade")


    // when 표현식
//    val s = "123"
//    val x = 123
//
//    val parsed = parseInt(s)
//    when(x) {
////        parseInt(s) -> println("일치")
//        parsed -> println("일치함")
//        else -> println("기타")
//    }


    // when
//    print("점수 입력: ")
////    val score = readLine()!!.toDouble()
//    val score = readLine()?.toDoubleOrNull() ?: "올바른 값을 입력하시오"
//
//    var grade: Char = 'F'
//
//    when(score) {
//        in 90.0..100.0 -> grade = 'A'
//        in 80.0..89.9 -> grade = 'B'
//        in 70.0..79.9 -> grade = 'C'
//        in 60.0..69.9 -> grade = 'D'
//        else -> grade = 'F'
//    }
//
//    println("score: $score, grade: $grade")

    // in + when
//    var str = "사랑해요, kotlin"
//    var result = when(str) {
////        is String -> println("문자열이다")
//        is String -> "문자열이다"
//        else -> false
//    }
//    println(result)
//
//    // 인자가 없는 when
//    print("점수 입력: ")
////    val score = readLine()!!.toDouble()
//    val score = readLine()?.toDoubleOrNull() ?: 0.0
//    println(score.javaClass)
//    var grade: Char = 'F'
//
//    when {
//        score in 90.0..100.0 -> grade = 'A'
//        score in 80.0..89.9 -> grade = 'B'
//        score in 70.0..79.0 -> grade = 'C'
//        score in 60.0..69.9 -> grade = 'D'
//        else -> grade = 'F'
//    }
//    println("score: $score, grade: $grade")


    // for
//    for (x in 1..5) println(x)

    // downTo, step
//    for (i in 5 downTo 1) print(i)
//    for (i in 1..5 step 2) print(i)
//    for (i in 5 downTo 1 step 2) print(i)

    // while & do-while
//    var i = 0
//    do {
//        println("$i")
//        ++i
//    } while (i <= 10)

    // continue & break
//    while (true) {
//        val randomNum = Random.nextInt(10)
//        println("rnadomNum: $randomNum")
//        if (randomNum == 3) break
//    }
//    println("프로그램 종료")

//    for (x in 1..10) {
//        if (x % 2 != 0) {
//            continue
//        }
//        println("$x 는 짝수")
//    }


    // 예제 1
//    print("국어 점수 입력: ")
//    var ko = readLine()!!.toDouble()
//    print("영어 점수 입력: ")
//    var en = readLine()!!.toDouble()
//    print("수학 점수 입력: ")
//    var math = readLine()!!.toDouble()
//
//    var avg = (ko + en + math) / 3
//    println("평균 점수: $avg")
//    if (ko >= avg) println("국어 점수: $ko 는 평균 점수 이상이다") else println("국어 점수: $ko 는 평균 점수보다 낮다")
//    if (en >= avg) println("영어 점수: $en 는 평균 점수 이상이다") else println("영어 점수: $en 는 평균 점수보다 낮다")
//    if (math >= avg) println("수학 점수: $math 는 평균 점수 이상이다") else println("수학 점수: $math 는 평균 점수보다 낮다")

    // 예제 2
//    var evenSum: Int = 0
//    var oddSum: Int = 0
//
//    for (i in 1..100) {
//        if (i % 2 == 0) {
//            evenSum += i
//        } else {
//            oddSum += i
//        }
//    }
//    println("짝수의 합: $evenSum, 홀수의 합: $oddSum")

    // 예제 3
//    for (i in 2..9) {
//        for (j in 1..9) {
//            println("$i * $j = ${i * j}")
//        }
//        println()
//    }

    // 예제 4
//    for (x in 1..10) {
//        for (y in 1..10) {
//            if ((x * 4) + (y * 5) == 60 ) {
//                println("$x, $y")
//            }
//        }
//    }

    // 예제 5
    print("팩토리얼을 구하고 싶은 숫자 입력: ")
    var num = readLine()!!.toInt()
    var fact: Int = 1

    // 5! = 5 * 4 * 3 * 2 * 1
    // num - 1

    while (num != 1) {
        fact *= num
        num--
    // 5 * (5 - 1)
    // 4 * (4 - 1)
    // 3 * (3 - 1)
    // 2 * (1 - 1)
    // 1 * (1 - 1) = 0...
    }
    println(fact)

    // 예제 6
//    while (true) {
//        var dice1 =  Random.nextInt(1..6)
//        var dice2 =  Random.nextInt(1..6)
//        println("주사위의 눈: ($dice1, $dice2)")
//
//        if (dice1 + dice2 == 5) {
//            println("합이 5가 되는 주사위의 눈: ($dice1, $dice2)")
//            break
//        }
//    }

    // 예제 7
//    while(true) {
//        println("[메뉴] 1: 검색, 2: 등록, 3: 삭제, 4: 변경, 0: 종료 > ")
//        var menuNo = readLine()!!.toInt()
//
//        if (menuNo == 1) {
//            println("검색합니다.")
//            break
//        } else if (menuNo == 2) {
//            println("등록합니다.")
//            break
//        } else if (menuNo == 3) {
//            println("삭제합니다.")
//            break
//        } else if (menuNo == 4) {
//            println("변경합니다.")
//            break
//        } else if (menuNo == 0) {
//            println("종료합니다.")
//            break
//        } else {
//            println("올바른 번호를 입력하세요.")
//            continue
//        }
//    }
//






}



// when 표현식
//fun parseInt(str: String): Int? = str.toIntOrNull()

// 예제 6
//fun categoryByAge(age: Int) = when {
//    age < 13 -> "어린이"
//    age in 13..19 -> "청소년"
//    else -> "성인"
//}

//fun anyFunc(anyPar: Any) {
//    if (anyPar is Int)
//        println("anyPar is Int: $anyPar, type: ${anyPar.javaClass}")
//
//    if (anyPar is String)
//        println("anyPar is String: $anyPar, type: ${anyPar.javaClass}")
//
//    if (anyPar is Double)
//        println("anyPar is Double: $anyPar, type: ${anyPar.javaClass}")
//
//    if (anyPar is Boolean)
//        println("anyPar is Boolean: $anyPar, type: ${anyPar.javaClass}")
//
//    if (anyPar is Char)
//        println("anyPar is Char: $anyPar, type: ${anyPar.javaClass}")
//}