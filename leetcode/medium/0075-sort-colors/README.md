# Sort Colors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array `nums` with `n` objects colored red, white, or blue, sort them  **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers `0`, `1`, and `2` to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

 **Example 1:** 

```
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

```

 **Example 2:** 

```
Input: nums = [2,0,1]
Output: [0,1,2]

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2.

 

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 23.33%)  
**Memory:** 43.7 MB (beats 24.81%)  
**Submitted:** 2026-08-12T16:48:28.830Z  

```java
class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;

        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                if(nums[i]>nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                }
            }
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-colors/)