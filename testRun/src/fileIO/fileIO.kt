// 2025.08.22
package fileIO

import java.io.File

fun main() {
    // 파일 존재 여부 확인 및 파일 생성
//    val file = File("example.txt")
//    if (file.exists()) {
//        println("파일 존재함")
//        println("파일 크기: ${file.length()} 바이트")
//        println("파일 경로: ${file.absolutePath}")
//    } else {
//        println("파일 없음")
//        file.createNewFile()
//    }

    // 전체 파일 한번에 읽기
//    val filePath = "example.txt"
//    val content = File(filePath).readText()
//    println("파일 내용:\n${content}")

    // 파일 한줄씩 읽기
//    val lines = File("example.txt").readLines()
//    for ((index, line) in lines.withIndex()) {
//        println("${index + 1}: $line")
//    }

    // 파일 쓰기
//    val text = "안녕 난 코틀린이야!"
//    File("output.txt").writeText(text)
//    println("파일 저장 완료")
//
//    // 기존 파일에 추가하기
//    File("output.txt").appendText("\n추가할 내용이 있어서 추가할게.")

    // 예제 1
//    val txt = "이번 시간은 코틀린 수업 시간이다."
//    File("kotlinLecture.txt").writeText(txt)
//    println("파일 저장 완료")

    // 예제 2
    val numTxt = "10\n20\n30\n40\n50"
    File("numbers.txt").writeText(numTxt)
    println("파일 저장 완료")

    val lines = File("numbers.txt").readLines()
    var sum: Int = 0
    for (num in lines) {
        sum += num.toInt()
    }
    println("합계: $sum")

    // 예제 3
    try {
        val content = File("not_exist.txt").readText()
        println(content)
    } catch (e: Exception) {
        println(e.message)
    }


}
