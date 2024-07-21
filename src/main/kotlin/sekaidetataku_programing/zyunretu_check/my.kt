package sekaidetataku_programing.zyunretu_check

// 世界で闘うプログラミング力を鍛える本 p.107 問題1.2
fun my(str_1: String, str_2: String): Boolean {
    if (str_1.length != str_2.length) return false

    val sort_Str_1 = str_1.split("").sorted().joinToString("")
    val sort_Str_2 = str_2.split("").sorted().joinToString("")

    if(sort_Str_1 != sort_Str_2) return false

    return true
}

fun main() {
    val result = my("abc", "ggg")
    println(result)
}
