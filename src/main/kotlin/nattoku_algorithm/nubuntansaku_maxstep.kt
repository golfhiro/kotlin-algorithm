package nattoku_algorithm

fun calculateMaxStepsForBinarySearch(listSize: Int): Int {
    var steps = 0
    var size = listSize

    while(size > 1) {
        size /= 2
        steps++
    }
    return steps
}

fun main(){
    val maxSteps = calculateMaxStepsForBinarySearch(128)
    println("2分探索の最大ステップ数: $maxSteps")
}
