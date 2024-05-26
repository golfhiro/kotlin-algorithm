package leat_code

// url
// https://leetcode.com/problems/two-sum/description/

fun toSum(nums: IntArray, target: Int): IntArray {
    val diffMap = mutableMapOf<Int, Int>()
    nums.forEachIndexed{ index, int ->
        diffMap[int]?.let {return intArrayOf(it, index)}
        diffMap[target - int] = index // 補数を求めて、diffMapのkeyに格納。補数と次以降の配列の値が同じであれば
    }
    return intArrayOf()
}

fun main() {
    val result = toSum(intArrayOf(1,2,4), 7)
    println(result.joinToString())
}
