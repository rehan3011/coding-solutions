# Single Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **non-empty**  array of integers `nums`, every element appears  *twice*  except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

 **Example 1:** 

 **Input:**  nums = [2,2,1]

 **Output:**  1

 **Example 2:** 

 **Input:**  nums = [4,1,2,1,2]

 **Output:**  4

 **Example 3:** 

 **Input:**  nums = [1]

 **Output:**  1

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- -3  *104 <= nums[i] <= 3*  104
- Each element in the array appears twice except for one element which appears only once.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.94%)  
**Memory:** 46.6 MB (beats 92.67%)  
**Submitted:** 2026-08-26T18:19:32.003Z  

```java
class Solution {

    //solution 1
    // public int singleNumber(int[] nums) {
    //     Map<Integer,Integer> mp = new HashMap<>();
    //     int n = nums.length;
    //     for(int i:nums){
    //         mp.put(i,mp.getOrDefault(i,0)+1);
    //     }
    //     for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
    //         if(entry.getValue()==1){
    //             return entry.getKey();
    //         }
    //     }
    //     return 0;
    // }

    // Wrong Approach
    // public int singleNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums[nums.length-1];
    //     int arr[] = new int[n+1];

    //     for(int i:nums){
    //         arr[i]++;
    //     }

    //     for(int j:nums){
    //         if(arr[j]==1){
    //             return j; 
    //         }
    //     }
    //      return 0;
    // }

    //Correct But Slow
    // public int singleNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     int min = nums[0];
    //     int max = nums[nums.length - 1];
        
    //     int range = max - min + 1;
    //     int arr[] = new int[range];


    //     for (int i : nums) {
    //         arr[i - min]++;
    //     }


    //     for (int i : nums) {
    //         if (arr[i - min] == 1) {
    //             return i; 
    //         }
    //     }
    //     return 0;
    // }

     public int singleNumber(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            index=index^nums[i];
        }
        
        return index;
     }

}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number/)