package leat_code

// URL
// https://leetcode.com/problems/roman-to-integer/description/

fun romanToInt(s: String): Int {
    val map = mutableMapOf<Char, Int>(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var count = 0
    var last = 1000
    s.forEach{
        val value = map[it] ?: 0
        if(value > last ) count -= last * 2
        count += value
        last = value
    }

    return count
}

fun main(){
    val result = romanToInt("III")
    print(result)
}
