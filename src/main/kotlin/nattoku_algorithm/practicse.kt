package nattoku_algorithm

fun practice() {
    val prefectures = mutableSetOf("大阪", "京都", "奈良", "和歌山", "兵庫", "滋賀")
    val stations = mapOf(
        "テレビ局A" to setOf("大阪", "京都", "奈良"),
        "テレビ局B" to setOf("大阪", "和歌山", "兵庫"),
        "テレビ局C" to setOf("京都", "奈良", "滋賀"),
        "テレビ局D" to setOf("和歌山", "兵庫"),
        "テレビ局E" to setOf("奈良", "和歌山", "滋賀")
    )

    val finalStations = mutableSetOf<String>()

    while(prefectures.isNotEmpty()) {
        var bestStations: String? = null        // 最適なテレビ局を格納する変数
        var prefecturesCovered = setOf<String>()        // 今までの最適なテレビ局がカバーする都道府県の集合
        for((station, prefecture) in stations) {        // stationsからテレビ局とそのテレビ局をカバーしてる都道府県を取り出す
            val coveredPrefectures = prefectures.intersect(prefecture)            // 必要な都道府県とそのテレビ局がカバーしてる都道府県の共通部分を取り出す
            if(coveredPrefectures.size > prefecturesCovered.size) {            // 必要な都道府県よりも共通部分の都道府県が多かった場合
                bestStations = station
                prefecturesCovered = prefecture
            }
        }

        if(bestStations != null){    // 最適なテレビ局が見つかった場合
            prefectures.removeAll(prefecturesCovered)// カバーされた都道府県を「必要な都道府県」から削除
            finalStations.add(bestStations)  // 最適なテレビ局を最終セットに追加f
        }
    }

    println(finalStations)
}

fun main() {
    practice()
}
