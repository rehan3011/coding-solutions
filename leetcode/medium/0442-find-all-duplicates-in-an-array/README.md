# Find All Duplicates in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range `[1, n]` and each integer appears  **at most**   **twice**, return  *an array of all the integers that appears  **twice***.

You must write an algorithm that runs in `O(n)` time and uses only  *constant*  auxiliary space, excluding the space needed to store the output

 

 **Example 1:** 

```
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

```

 **Example 2:** 

```
Input: nums = [1,1,2]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1]
Output: []

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 105
- 1 <= nums[i] <= n
- Each element in nums appears once or twice.

## Solution

**Language:** Java  
**Runtime:** 26 ms (beats 20.17%)  
**Memory:** 65.3 MB (beats 39.34%)  
**Submitted:** 2026-10-06T13:07:24.972Z  

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);

        List <Integer> list = new ArrayList<>();
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                list.add(nums[i]);
                i++;
            }
        }
        return list;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-duplicates-in-an-array/)