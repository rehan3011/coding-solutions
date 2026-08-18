# Sort an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums`, sort the array in ascending order and return it.

You must solve the problem  **without using any built-in**  functions in `O(nlog(n))` time complexity and with the smallest space complexity possible.

 

 **Example 1:** 

```
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

```

 **Example 2:** 

```
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessarily unique.

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -5  *104 <= nums[i] <= 5*  104

## Solution

**Language:** Java  
**Runtime:** 31 ms (beats 28.23%)  
**Memory:** 82.8 MB (beats 74.89%)  
**Submitted:** 2026-08-18T08:30:50.608Z  

```java
class Solution {
    //mergesort approach
    public int[] sortArray(int[] nums) {
        
        mergeSort(nums);
        return nums;
    }

    public static void mergeSort(int[] arr){
        int len = arr.length;
        
        if(len<=1) return;
        int mid = len/2;
        int larr[] = new int[mid];
        int rarr[] = new int[len-mid];
        int i=0, l=0, r=0;
        for(; i<len; i++){
            if(i<mid){
                larr[l] = arr[i];
                l++;
            }
            else{
                rarr[r] = arr[i];
                r++;
            }
        }

        mergeSort(larr);
        mergeSort(rarr);
        merge(arr,larr,rarr);
    }
    public static void merge(int[] arr, int[] larr, int[] rarr){
        int lLen = larr.length;
        int rLen = rarr.length;
        int i=0, l=0, r=0;

        while(l<lLen && r<rLen){
            if(larr[l]<rarr[r]){
                arr[i] = larr[l];
                i++;
                l++;
            }
            else{
                arr[i] = rarr[r];
                i++;
                r++;
            }
        }

        while(l<lLen){
                arr[i] = larr[l];
                i++;
                l++; 
        }
        while(r<rLen){
            arr[i] = rarr[r];
            i++;
            r++;
        }
    }
}

// quicksort approach
    
    // public int[] sortArray(int[] nums) {
    //     int n = nums.length;
    //     int low = 0;
    //     int high = n-1;
    //     quickSort(nums, low, high);
    //     return nums;
    // }

    // public static void quickSort(int[] arr, int low, int high){
    //     if(low<high) {
    //         int pivot = partition(arr, low, high);

    //         quickSort(arr, low, pivot-1);
    //         quickSort(arr,pivot+1,high);
    //     }
    // }
    
    // public static int partition(int[] arr, int low, int high){
    //     int pivot = arr[high];
    //     int i = low-1;

    //     for(int j=low; j<high; j++){
    //         if(arr[j]<=pivot){
    //             i++;
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }
    //     int temp = arr[i+1];
    //     arr[i+1] = arr[high];
    //     arr[high] = temp;
    //     return i+1;
    // }


        //wrong approach
        // int n = nums.length;
        // int freq[] = new int[n+2];
        
        // for(int num:nums){
        //     freq[num]++;
        // }
        // int k=0;
        // for(int j=0; j<freq.length; j++){
        //     while(freq[j]>0){
        //         nums[k++] = j;
        //         freq[j]--;
        //     }
        // }
        // return nums;
```

---

[View on LeetCode](https://leetcode.com/problems/sort-an-array/)