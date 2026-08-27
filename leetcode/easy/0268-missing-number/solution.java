class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = (n*(n+1))/2;
        int actualSum = 0;
        for(int i=0; i<n; i++){
            actualSum +=nums[i];
        }
        return -(actualSum-sum);
        // int n = nums.length;
        // Arrays.sort(nums);
        // if(nums[n-1]!=n) return n;
        // for(int i=0; i<n; i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return -1;
    }
}