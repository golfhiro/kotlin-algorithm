package leat_code

// url
// https://leetcode.com/problems/two-sum/description/

// 簡単な回答
fun twoSum(nums: IntArray, target: Int): IntArray {
    for(i in 0..nums.size-1) {
        for(j in i+1..nums.size-1) {
            if(nums[i] + nums[j] == target) {
                return intArrayOf(i,j)
            }
        }
    }
    return intArrayOf()
}

fun main() {
    val result = twoSum(intArrayOf(1,2,3), 3)
    println(result.contentToString())
}

// コード量を少なくした記述
//fun twoSum(nums: IntArray, target: Int): IntArray {
//    val diffMap = mutableMapOf<Int, Int>()
//    nums.forEachIndexed{ index, int ->
//        diffMap[int]?.let {return intArrayOf(it, index)}
//        diffMap[target - int] = index // 補数を求めて、diffMapのkeyに格納。補数と次以降の配列の値が同じであれば
//    }
//    return intArrayOf()
//}
//
//fun main() {
//    val result = twoSum(intArrayOf(1,2,4), 7)
//    println(result.joinToString())
//}
