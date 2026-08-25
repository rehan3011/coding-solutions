class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int multiple = k;

        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }
}
//     public int missingMultiple(int[] nums, int k) {
//         Arrays.sort(nums);

//         int n = nums.length;
//         int max = nums[n - 1];

//         Set<Integer> set = ReturnLeast(n, max, k);

//         for (int x : set) {
//             if (Arrays.binarySearch(nums, x) < 0) {
//                 return x;
//             }
//         }

//         int curr = k;

//         while (curr <= max) {
//             curr += k;
//         }

//         return curr;
//     }

//     public static Set<Integer> ReturnLeast(int n, int max, int k) {
//         Set<Integer> set = new TreeSet<>();

//         int curr = k;

//         while (curr <= max) {
//             set.add(curr);
//             curr += k;
//         }

//         return set;
//     }
// }