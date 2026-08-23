# Q1. Check ASCII Palindromic

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` consisting of lowercase English letters.

Construct a  **binary string**  by replacing each character in `s` with the 8-bit binary representation of its ASCII value,  **including leading zeros**, while preserving the original order of the characters.

Return `true` if the resulting binary string is a  **palindrome**. Otherwise, return `false`.

A  **binary string**  is a string which contains only the characters `'0'` and `'1'`.

A  **palindrome**  is a string that reads the same forward and backward.

 

 **Example 1:** 

 **Input:**  s = "ff"

 **Output:**  true

 **Explanation:** 

- The ASCII value of f is 102, whose 8-bit binary representation is 01100110.
- Thus, the binary string is 0110011001100110.
- Since this binary string is a palindrome, the output is true.

 **Example 2:** 

 **Input:**  s = "leet"

 **Output:**  false

 **Explanation:** 

- The ASCII values of l, e, e, and t are 108, 101, 101, and 116, respectively.
- Their 8-bit binary representations are 01101100, 01100101, 01100101, and 01110100.
- Thus, the binary string is 01101100011001010110010101110100.
- Since this binary string is not a palindrome, the output is false.

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 13 ms  
**Memory:** 46.5 MB  
**Submitted:** 2026-08-23T03:15:42.630Z  

```java
class Solution {
    public boolean isPalindromic(String s) {
    StringBuilder add = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            String b = String.format("%8s", 
                Integer.toBinaryString(s.charAt(i)))
                .replace(' ', '0');
            add.append(b);
        }
        int left =0;
        int right = add.length()-1;
        while(left<right){
            if(add.charAt(left)!=add.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-ascii-palindromic/)