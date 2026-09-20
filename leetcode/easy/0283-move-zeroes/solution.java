class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int j = 0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        //solution 1
        // int n = nums.length;
        // int j = 0;
        // for(int i=0; i<n; i++){
        //     if(nums[i]!=0){
        //         nums[j] = nums[i];
        //         j++;
        //     }
        // }

        // for(int i=j; i<n; i++){
        //     nums[i]=0;
        // }
    }
}