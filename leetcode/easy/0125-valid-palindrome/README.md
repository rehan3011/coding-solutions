# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 19.42%)  
**Memory:** 46.3 MB (beats 26.70%)  
**Submitted:** 2026-08-03T16:22:00.943Z  

```java
class Solution {
    public boolean isPalindrome(String s) {
        //optimal solution

        


        // Brute Force Approach
  String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int n = str.length();
    int start = 0 ;
    int end = n - 1;
    while(start < end){
        if(str.charAt(start) != str.charAt(end)){
            return false ;
        }
            start++ ;
            end -- ;
        }
    return true ;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)