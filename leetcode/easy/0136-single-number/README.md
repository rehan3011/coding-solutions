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
**Runtime:** 11 ms (beats 24.01%)  
**Memory:** 48.4 MB (beats 6.93%)  
**Submitted:** 2026-08-26T17:48:16.118Z  

```java
class Solution {
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

    public int singleNumber(int[] nums) {
        // Step 1: Sort to easily find the min and max values
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        
        // Step 2: Size the array to fit the entire range of numbers safely
        int range = max - min + 1;
        int arr[] = new int[range];

        // Step 3: Shift indices by subtracting 'min' to handle negative numbers
        for (int i : nums) {
            arr[i - min]++;
        }

        // Step 4: Find the element with a count of 1
        for (int i : nums) {
            if (arr[i - min] == 1) {
                return i; 
            }
        }
        return 0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number/)