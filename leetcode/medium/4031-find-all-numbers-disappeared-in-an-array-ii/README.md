# Find All Numbers Disappeared in an Array II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` and two integers `lower` and `upper`.

A  **missing integer**  is an integer in the inclusive range `[lower, upper]` that does not appear in `nums`.

Return a 2D integer array where each element is of the form `[start, end]`, representing a  **contiguous**  range of missing integers. Return the ranges in  **increasing**  order. If there are no missing integers, return an empty array.

 **Note:**  Consecutive missing integers should be grouped into a single range.

 

 **Example 1:** 

 **Input:**  nums = [3,9,7], lower = 1, upper = 12

 **Output:**  [[1,2],[4,6],[8,8],[10,12]]

 **Explanation:** 

- The missing integers are [1, 2, 4, 5, 6, 8, 10, 11, 12].
- Grouping the missing integers into the minimum number of contiguous ranges, we get [1, 2], [4, 6], [8, 8], and [10, 12].
- Therefore, the answer is [[1, 2], [4, 6], [8, 8], [10, 12]].

 **Example 2:** 

 **Input:**  nums = [1,1], lower = 5, upper = 7

 **Output:**  [[5,7]]

 **Explanation:** 

- The missing integers are [5, 6, 7].
- Grouping the missing integers into the minimum number of contiguous ranges, we get [5, 7].
- Therefore, the answer is [[5, 7]].

 **Example 3:** 

 **Input:**  nums = [2,3,5], lower = 2, upper = 3

 **Output:**  []

 **Explanation:** 

- There are no missing integers.
- Therefore, the answer is [].

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 105
- 1 <= lower <= upper <= 105

## Solution

**Language:** Java  
**Runtime:** 93 ms (beats 15.02%)  
**Memory:** 175.5 MB (beats 22.05%)  
**Submitted:** 2026-08-23T11:42:21.353Z  

```java
import java.util.*;

class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Set <Integer> hs = new HashSet<>();
        List<List<Integer>> ls = new ArrayList<>();
        int i = lower;
        for(int j:nums){
            hs.add(j);
        }
        while(i <= upper){
            if(hs.contains(i)){
                i++;
                continue;
            }
            int start = i;
            while(i<=upper && !hs.contains(i)){
                i++;
            }
            int high = i-1;
            ls.add(Arrays.asList(start,high));
        }
        return ls;
    }
    // public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        
    //     Set<Integer> presentNumbers = new HashSet<>();
    //     for (int num : nums) {
    //         presentNumbers.add(num);
    //     }

    //     List<List<Integer>> result = new ArrayList<>();
    //     int startMissing = -1;

        
    //     for (int i = lower; i <= upper; i++) {
    //         if (!presentNumbers.contains(i)) {
                
    //             if (startMissing == -1) {
    //                 startMissing = i;
    //             }
    //         } else {
                
    //             if (startMissing != -1) {
    //                 result.add(Arrays.asList(startMissing, i - 1));
    //                 startMissing = -1; 
    //             }
    //         }
    //     }

       
    //     if (startMissing != -1) {
    //         result.add(Arrays.asList(startMissing, upper));
    //     }

    //     return result;
    // }
}

```

---

[View on LeetCode](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array-ii/)