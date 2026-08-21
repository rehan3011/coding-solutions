# Letter Combinations of a Phone Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent. Return the answer in  **any order**.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

 

 **Example 1:** 

```
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

```

 **Example 2:** 

```
Input: digits = "2"
Output: ["a","b","c"]

```

 

 **Constraints:** 

- 1 <= digits.length <= 4
- digits[i] is a digit in the range ['2', '9'].

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 5.45%)  
**Memory:** 48.9 MB (beats 18.35%)  
**Submitted:** 2026-08-21T14:22:13.978Z  

```java
class Solution {
    public List<String> letterCombinations(String s) {
        List <String> str = new ArrayList<>();

        if(s.length()==0) return str;

        int n = s.length();
        str.add("");
        for(int i=0; i<n; i++){
            String s1 = check(s.charAt(i));
            List <String> temp = new ArrayList<>();
            for(String exist:str){
                for(int j=0; j<s1.length(); j++){
                    temp.add(exist+s1.charAt(j));
                }
            }

            str = temp;
            
        }
            return str;
    }

    public static String check(char ch){
        if(ch =='2') return "abc";
        else if(ch == '3') return "def";
        else if(ch == '4') return "ghi";
        else if(ch == '5') return "jkl";
        else if(ch == '6') return "mno";
        else if(ch == '7') return "pqrs";
        else if(ch == '8') return "tuv";
        else if(ch == '9') return "wxyz";
        return "";
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)