
// 世界で闘うプログラミング力を鍛える本 p.107 問題1.1
fun isUniqueChars(str: String): Boolean {
    if (str.length > 128) return false
    val charSet = BooleanArray(128)
    for (i in str.indices) {
        val value = str[i].code
        if (charSet[value]) {
            return false
        }
        charSet[value] = true
    }
    return true
}

fun main() {
    val result = isUniqueChars("fdad")
    println(result)
}
