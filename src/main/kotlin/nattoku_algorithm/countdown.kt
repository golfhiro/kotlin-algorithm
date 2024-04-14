package nattoku_algorithm

fun countdown(i: Int) {
    println(i)
    if (i <= 0) {
        return
    } else {
        countdown(i - 1)
    }
}

fun main(){
    println(countdown(2))
}
