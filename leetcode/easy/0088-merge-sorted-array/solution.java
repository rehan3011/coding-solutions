class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num[]=new int[m+n];
        for(int i=0;i<m;i++){
            num[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            num[m]=nums2[j];
            m++;
        }
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            nums1[i]=num[i];
        }
    }
}