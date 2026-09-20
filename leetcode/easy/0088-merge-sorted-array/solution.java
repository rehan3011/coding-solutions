class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;
        
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }


        //solution 1
        // int j=0;
        // for(int i=m; i<nums1.length; i++){
        //     nums1[i] = nums2[j];
        //     j++;
        // }
        // Arrays.sort(nums1);

        
    }
}