class Solution {
        public static void reverse(int[] nums, int left, int right){

            while(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        if(k<0)
        {
            k+=nums.length;
        }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);


        //wrong approach
        // int n = nums.length;

        //  k = k%n;

        // for(int i=0; i<k; i++){
        //     int last = nums[n-1];
        //     for(int j=n-1; j>0; j--){
        //         nums[j] = nums[j-1];

        //         }
        //     nums[0]=last;
        // }
    }
}