package sekaidetataku_programing.kaibun_no_zyunretu

fun can_form_palindrome(str: String): Boolean {
    val s = str.replace("\\s".toRegex(), "").lowercase()
    val hash = mutableMapOf<Char, Int>()

    for (char in s) {
        hash[char] = hash.getOrDefault(char, 0) + 1
    }

    var oddCount = 0
    for (value in hash.values) {
        if (value % 2 != 0) {
            oddCount++
        }
    }

    return oddCount <= 1
}

fun main() {
    val result = can_form_palindrome("aa Coa")
    println(result)
}
