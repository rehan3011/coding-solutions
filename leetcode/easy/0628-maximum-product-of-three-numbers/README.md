# Maximum Product of Three Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`,  *find three numbers whose product is maximum and return the maximum product*.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: 6

```

 **Example 2:** 

```
Input: nums = [1,2,3,4]
Output: 24

```

 **Example 3:** 

```
Input: nums = [-1,-2,-3]
Output: -6

```

 

 **Constraints:** 

- 3 <= nums.length <= 104
- -1000 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 80.39%)  
**Memory:** 48 MB (beats 70.80%)  
**Submitted:** 2026-07-26T12:43:31.354Z  

```java
class Solution {
    public int maximumProduct(int[] arr) {
        // int n = arr.length;
        // int maxValue1 = 1;
        // int maxValue2 = 1;
        // int j = 1;
        // int ans =1;
        // int count = 0;
        // for(int i=0; i<n-2; i++){
        //     maxValue1 = Math.abs(arr[i]*arr[j]);
        //     maxValue2 = Math.abs(maxValue1*arr[j+1]);
        //     ans  = Math.max(maxValue1,maxValue2);
        //     if(arr[i]<0||arr[j]<0||arr[j+1]<0){
        //         count++;
        //     }
        //     j++;

        // }
        // if(count>0){
        //     return ans*-1;
        // }
        // return ans;
        Arrays.sort(arr);
        int n = arr.length;

        int product1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int product2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(product1, product2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)