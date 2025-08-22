// 2025.08.22
package collections

fun main() {
    // Array
//    val stringArr = Array(10, {item -> ""})
//    val dayArr = arrayOf("MON", "TUE", "WED")
//    val strArr: Array<String> = arrayOf("a", "b", "c")
//    val intArr = intArrayOf(1,2,3)
//    val arr1 = Array(5) { 0 }
//    val arr2 = Array(3) {"Hello"}
//    val intArr1 = intArrayOf(1,2,3)
//    val doubleArr = DoubleArray(3) {it * 1.5}
//    val scoreInt = IntArray(10)
//    scoreInt[0] = 90
//    scoreInt.set(1, 85)
//    println(scoreInt[0])
//    println(scoreInt[1])
//    val scoreVal0 = scoreInt[0]
//    println(scoreInt.get(1))

    // List
//    val list = listOf("아메리카노", "카페라떼", "카푸치노")
//    println("크기: ${list.size} 아메리카노 출력: ${list[0]}, 전체: $list")
//    val list2 = mutableListOf("값1", "값2", "값3")
//    list2.add("값4")
//    println(list2)
//    val listValue = list2.get(1)
//    println(listValue)
//    list2.set(1, "수정할 값")
//    println(list2.get(1))
//    list2.removeAt(1)
//    println(list2)

    // Set
//    val set = setOf("아메리카노", "카페라떼", "카푸치노", "카페라떼")
//    println("크기: ${set.size}, 전체: $set")
//    val set = mutableSetOf<String>()
//    set.add("1")
//    set.add("2")
//    set.add("3")
//    set.add("1")
//    println(set)
//    val set = mutableSetOf("1", "2", "3", "1")
//    println(set)
//    set.remove("2")
//    println(set)

    // Map
//    val map = mapOf("아메리카노" to 4000, "카페라떼" to 5000)
//    println("크기: ${map.size}, 아메리카노 가격: ${map["아메리카노"]}")
//    val map = mutableMapOf<String, String>()
//    map["키1"] = "값1"
//    map["키2"] = "값2"
//    map["키3"] = "값3"
//    println(map)
//    println(map["키1"])
//    map["키2"] = "수정값"
//    println(map)
//    map.remove("키2")
//    println(map)

    // Filter
//    val num = listOf(1,2,3,4,5,6)
//    val even = num.filter { it % 2 == 0 }
//    println(even)

    // Map
//    val names = listOf("홍길동", "이순신")
//    val length = names.map { it.length }
//    println(length)

    // Reduce
//    val prices = listOf(1000, 2000, 1500)
//    val total = prices.reduce { acc, price -> acc + price }
//    println(total)

    // forEach
//    val fruits = listOf("사과", "바나나", "포도")
//    fruits.forEach { println(it) }

    // Count
//    val scores = listOf(90, 70, 85, 60)
//    val highScoreCount = scores.count {it >= 80}
//    println(highScoreCount)

    // method chaining
//    val nums = listOf(1,2,3,4,5,6)
//    val result = nums
//        .filter { it % 2 == 0}
//        .map { it * it}
//    println(result)

    // 예제 1
    val names = listOf("홍길동", "신짱구", "Elizabeth", "John", "Alexander")
    for (name in names) {
        if (name.length >= 5) {
            println(name.uppercase())
        }
    }

    // 예제 2
    val products = mapOf(
        "apple" to 3000,
        "banana" to 1500,
        "grape" to 4000,
        "peach" to 2800
    )
    for ((key, value) in products) {
        if (value >= 3000) {
            println(key)
        }
    }

    // 예제 3
    val data = listOf(
        listOf(1,2,3),
        listOf(4,5,6),
        listOf(7,8,9)
    )
    val newData = data.flatten()
//    println(newData)
    val evenTotal = newData
        .filter { it % 2 == 0 }
        .reduce { acc, i -> acc + i }
    println(evenTotal)

    // 예제 4
    val numbers = arrayOf(1,3,5,7,9)
    numbers.forEach { println(it) }

    // 예제 5
    val words = arrayOf("Java", "Kotlin", "Swift", "KotlinConf", "Python")
    var newLst: MutableList<String> = mutableListOf()
    for (word in words) {
        if (word.contains("Kotlin")) {
            newLst.add(word)
        }
    }
    println(newLst)


}

// List
//fun printReadOnlyList(items: List<String>) {
//}
//fun modifyList(items: MutableList<String>) {
//    items.add("추가 가능")
//}