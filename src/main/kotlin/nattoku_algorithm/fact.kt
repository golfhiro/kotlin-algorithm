package nattoku_algorithm

fun fact(x: Int): Int{
    if(x != 1) {
        val result = x * fact(x-1)
        return result
    }
    return 1
}

fun main() {
    println(fact(3))
}
