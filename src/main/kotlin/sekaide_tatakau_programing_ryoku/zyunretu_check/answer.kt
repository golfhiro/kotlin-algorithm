package sekaide_tatakau_programing_ryoku.zyunretu_check

// 世界で闘うプログラミング力を鍛える本 p.107 問題1.2
fun answer(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val letters = IntArray(128) // ASCII の仮定のもと

    for (i in s.indices) {
        letters[s[i].code]++
    }

    for (i in t.indices) {
        letters[t[i].code]--
        if (letters[t[i].code] < 0) {
            return false
        }
    }

    return true
}

fun main() {
    val result = answer("aba", "bca")
    println(result)  // 出力: true
}
