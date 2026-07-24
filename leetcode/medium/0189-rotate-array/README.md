# Rotate Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

 

 **Example 1:** 

```
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

```

 **Example 2:** 

```
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -231 <= nums[i] <= 231 - 1
- 0 <= k <= 105

 

 **Follow up:** 

- Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
- Could you do it in-place with O(1) extra space?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 41.44%)  
**Memory:** 61.5 MB (beats 29.94%)  
**Submitted:** 2026-07-24T13:33:29.798Z  

```java
class Solution {
    private static void reverse(int[] nums, int l, int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;  
        }
    }
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k%=n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        System.out.print(nums);



        // Brute force approach :(
        
        // int n = nums.length;
        // int i = 0;
        // int j;
        // int last = 0;
        // k%=n;

        // for(i = 0; i<k; i++){
        //     last = nums[n-1];
        //     for(j = n-1; j>0; j--){
                
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = last; 
        // }
        // System.out.print(nums);

            
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-array/)