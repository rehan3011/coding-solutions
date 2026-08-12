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
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.7 MB (beats 24.81%)  
**Submitted:** 2026-08-12T17:23:00.622Z  

```java
class Solution {

    static void change(int nums[],int c0, int c1, int k){
        for(int i=c0; i<c0+c1; i++){
            nums[i]=k;
        }
    }
    public void sortColors(int[] nums) {
        
        int n = nums.length;

        int c1=0;
        int c2=0;
        int c3=0;

        for(int i =0; i<n; i++){
            if(nums[i]==0){
                c1++;
            }
            else if(nums[i]==1){
                c2++;
            }
            else if(nums[i]==2){
                c3++;
            }
        }

            
            change(nums,0,c1,0);
            change(nums,c1,c2,1);
            change(nums,c1+c2,c3,2);

        




        //bubble sort Solution  O(n^2) solution
        // for(int i = 0; i<n; i++){
        //     for(int j = i; j<n; j++){
        //         if(nums[i]>nums[j]){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         }
        //     }
        // }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-colors/)