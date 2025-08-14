//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
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
    var anyEx: Any = 100
    println("anyEx: $anyEx, type: ${anyEx.javaClass}")

    anyEx = 200L
    println("anyEx: $anyEx, type: ${anyEx.javaClass}")

    anyEx = "Hi, Kotlin!"
    println("anyEx: $anyEx, type: ${anyEx.javaClass}")

    anyEx = true
    println("anyEx: $anyEx, type: ${anyEx.javaClass}")

    anyEx = 3.14
    println("anyEx: $anyEx, type: ${anyEx.javaClass}")

    anyEx = 'A'
    println("anyEx: $anyEx, type: ${anyEx.javaClass}")



}