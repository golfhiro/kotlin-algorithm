package leat_code

// URL
// https://leetcode.com/problems/palindrome-number/description/

class palindrome_number {
    fun isPalindrome(x: Int): Boolean {
        return x.toString().reversed() == x.toString()
    }

    fun main() {
        isPalindrome(121)
    }
}
