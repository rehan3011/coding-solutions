# Longest Subarray With at Most K Distinct Prime Factors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` consisting of positive integers and an integer `k`.

The  **prime factor set**  of a  **subarray**  is the  **union**  of the distinct  **prime**  factors of all its elements.

Return the length of the  **longest**  subarray whose prime factor set contains  **at most**  `k` distinct prime factors. If no such subarray exists, return 0.

 

 **Example 1:** 

 **Input:**  nums = [7,6,10,12,11], k = 3

 **Output:**  3

 **Explanation:** 

Consider the subarray `[6, 10, 12]`:

- The distinct prime factors of 6 are {2, 3}.
- The distinct prime factors of 10 are {2, 5}.
- The distinct prime factors of 12 are {2, 3}.
- The union of these sets is {2, 3, 5}, which contains 3 distinct prime factors.

No longer subarray satisfies the condition. Therefore, the answer is 3.

 **Example 2:** 

 **Input:**  nums = [4,6,9,18], k = 4

 **Output:**  4

 **Explanation:** 

Consider the entire array `[4, 6, 9, 18]`:

- The distinct prime factors of 4 are {2}.
- The distinct prime factors of 6 are {2, 3}.
- The distinct prime factors of 9 are {3}.
- The distinct prime factors of 18 are {2, 3}.
- The union of these sets is {2, 3}, which contains 2 distinct prime factors.

Since `2 <= 4`, the entire array is valid. Therefore, the answer is 4.

 **Example 3:** 

 **Input:**  nums = [6,10,15], k = 2

 **Output:**  1

 **Explanation:** 

Every subarray of length at least 2 has prime factor set `{2, 3, 5}`, which contains 3 distinct prime factors.

Since `3 > 2`, only subarrays of length 1 are valid. Therefore, the answer is 1.

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 2 <= nums[i] <= 105
- 1 <= k <= 104

## Solution

**Language:** Java  
**Runtime:** 427 ms (beats 100.00%)  
**Memory:** 86 MB (beats 100.00%)  
**Submitted:** 2026-08-24T15:37:20.519Z  

```java
class Solution {
    public int longestSubarray(int[] arr, int k) {
        int slow = 0;
        int fast = 0;
        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while (fast < arr.length) {

            Set<Integer> factors = getPrimeFactors(arr[fast]);

            for (int factor : factors) {
                map.put(factor, map.getOrDefault(factor, 0) + 1);
            }

            while (map.size() > k) {
                Set<Integer> removeFactors = getPrimeFactors(arr[slow]);

                for (int factor : removeFactors) {
                    map.put(factor, map.get(factor) - 1);

                    if (map.get(factor) == 0) {
                        map.remove(factor);
                    }
                }

                slow++;
            }

            ans = Math.max(ans, fast - slow + 1);
            fast++;
        }

        return ans;
    }

    public static Set<Integer> getPrimeFactors(int n) {
        Set<Integer> set = new HashSet<>();

        while (n % 2 == 0) {
            set.add(2);
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            set.add(n);
        }

        return set;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-subarray-with-at-most-k-distinct-prime-factors/)