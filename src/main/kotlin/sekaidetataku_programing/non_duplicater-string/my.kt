package sekaidetataku_programing.`non_duplicater-string`

// 世界で闘うプログラミング力を鍛える本 p.107 問題1.1
fun nonDuplicatedString(str: String): String {
    for(i in 0 until str.length) {
        for (j in i + 1 until str.length) {
            if(str[i] == str[j] ) {
                return "重複している"
            }
        }
    }

    return "重複していない"
}


fun main() {
    val result = nonDuplicatedString("bg")
    println(result)
}
