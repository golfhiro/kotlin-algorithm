package nattoku_algorithm

fun stationPrefecture() {
    val prefecturesNeeded = mutableSetOf("東京", "神奈川", "千葉", "埼玉", "栃木", "茨城", "群馬")
    val stations = mapOf(
        "テレビ局A" to setOf("東京", "神奈川", "千葉"),
        "テレビ局B" to setOf("東京", "埼玉", "栃木"),
        "テレビ局C" to setOf("神奈川", "千葉", "茨城"),
        "テレビ局D" to setOf("埼玉", "群馬"),
        "テレビ局E" to setOf("栃木", "茨城", "群馬")
    )
    val finalStations = mutableSetOf<String>()

    while (prefecturesNeeded.isNotEmpty()) {    // prefecturesNeededが空になるまで繰り返す
        var bestStation: String? = null         // 最適なテレビ局を格納する変数
        var prefecturesCovered = setOf<String>()   // 今までの最適なテレビ局がカバーする都道府県の集合
        for ((station, prefecturesForStation) in stations) {  // テレビ局とそのテレビ局がカバーする都道府県の集合を取り出す
            val covered = prefecturesNeeded.intersect(prefecturesForStation) // 必要な都道府県とそのテレビ局がカバーする都道府県の共通部分
            if (covered.size > prefecturesCovered.size) { // より多くの都道府県をカバーするテレビ局が見つかった場合
                bestStation = station  // 最適なテレビ局を更新
                prefecturesCovered = covered // カバーする都道府県の集合を更新
            }
        }

        if (bestStation != null) { // 最適なテレビ局が見つかった場合
            prefecturesNeeded.removeAll(prefecturesCovered)  // カバーされた都道府県を「必要な都道府県」から削除
            finalStations.add(bestStation)  // 最適なテレビ局を最終セットに追加
        }
    }

    println(finalStations)
}

fun main() {
    stationPrefecture()
}
