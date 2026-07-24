class Solution {
    private static void reverse(int[] nums, int l, int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;  
        }
    }
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k%=n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        System.out.print(nums);



        // Brute force approach :(
        
        // int n = nums.length;
        // int i = 0;
        // int j;
        // int last = 0;
        // k%=n;

        // for(i = 0; i<k; i++){
        //     last = nums[n-1];
        //     for(j = n-1; j>0; j--){
                
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = last; 
        // }
        // System.out.print(nums);

            
    }
}