package nattoku_algorithm

fun findMaxNum(list: List<Int>): Int {
    var max = list[0]

    for (num in list) {
        if (num > max) {
            max = num
        }
    }
    return max
}

fun main() {
    val result = findMaxNum(listOf(1,2,3,4,5))
    println(result)
}
