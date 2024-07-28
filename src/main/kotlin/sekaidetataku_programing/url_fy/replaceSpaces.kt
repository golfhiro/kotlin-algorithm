package sekaidetataku_programing.url_fy

fun replaceSpaces(str: CharArray, trueLength: Int): String {
    var spaceCount = 0
    for (i in 0 until trueLength) {
        if (str[i] == ' ') {
            spaceCount++
        }
    }

    val newLength = trueLength + spaceCount * 2
    var index = newLength - 1

    // 変換用の配列を準備
    val result = CharArray(newLength)

    // 後ろから処理を開始する
    for (i in (trueLength - 1) downTo 0) {
        if (str[i] == ' ') {
            result[index--] = '0'
            result[index--] = '2'
            result[index--] = '%'
        } else {
            result[index--] = str[i]
        }
    }

    return String(result)
}

fun main() {
    // 入力として用意する文字列と真の長さ
    val str = "Mr John Smith ".toCharArray()
    val trueLength = 13

    // メソッドを呼び出して結果を表示
    val result = replaceSpaces(str, trueLength)
    println(result)
}
