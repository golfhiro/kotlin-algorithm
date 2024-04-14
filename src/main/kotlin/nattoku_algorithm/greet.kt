package nattoku_algorithm

fun greet(name: String) {
    println("hello, " + name + "!")
    greet2(name)
    println("getting ready to say bey..")
    bye()
}

fun greet2(name: String) {
    println("how are you, " + name + "?")
}

fun bye() {
    println("ok bye!")
}

fun main(){
    greet("溜")
}
