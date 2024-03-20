package nattoku_algorithm

// 納得アルゴリズム 二分探索のPythonからKotlinに変換したコード
fun binarySearch(list: List<Int>, item: Int): Int? {
    var low = 0                     // リストの最小のindex
    var high = list.size - 1   // リストの最大のindex

    while (low <= high) {                //
        val mid = (low + high) / 2
        val guess = list[mid]

        if (guess == item) {
            return mid  // ゲス（推測値）がアイテム（探索対象）と等しい場合、そのインデックス(mid)を返します。
        } else if (guess > item) {
            high = mid - 1  // ゲスがアイテムより大きい場合、ゲスの位置より前を探索対象とするためhighを更新します。
        } else {
            low = mid + 1  // ゲスがアイテムより小さい場合、ゲスの位置より後ろを探索対象とするためlowを更新します。
        }
    }
    return null  // 検索アイテムが見つからなかった場合
}

fun main() {
    val myList = listOf(1, 3, 5, 6, 9)
    println(binarySearch(myList, 9))  // 動作確認
    println(binarySearch(myList, -1))  // 動作確認
}
