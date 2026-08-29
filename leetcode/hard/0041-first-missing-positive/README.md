# First Missing Positive

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an unsorted integer array `nums`. Return the  *smallest positive integer*  that is  *not present*  in `nums`.

You must implement an algorithm that runs in `O(n)` time and uses `O(1)` auxiliary space.

 

 **Example 1:** 

```
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

```

 **Example 2:** 

```
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

```

 **Example 3:** 

```
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -231 <= nums[i] <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 17 ms (beats 18.08%)  
**Memory:** 93.2 MB (beats 7.85%)  
**Submitted:** 2026-08-29T09:06:46.800Z  

```java
class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Set <Integer> set = new HashSet<>();

        int n = nums.length;

        for(int i:nums){
            if(i>0){
                set.add(i);
            }
        }
        int start = 1;
        for(int j:set){
            if(set.contains(start)){
                start++;
            }
            else{
                return start;
            }
        }
        return start;
        
        //solution 1
        // int n = nums.length;
        // Arrays.sort(nums);
        // int start = 1;

        // for(int i:nums){
        //     if(i>0&&i==start){
        //         start++;
        //     }
        //     else if(i>start){
        //         return start;
        //     }
        // }
        // return start;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/first-missing-positive/)