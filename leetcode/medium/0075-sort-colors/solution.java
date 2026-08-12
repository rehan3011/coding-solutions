class Solution {

    static void change(int nums[],int c0, int c1, int k){
        for(int i=c0; i<c0+c1; i++){
            nums[i]=k;
        }
    }
    public void sortColors(int[] nums) {
        
        int n = nums.length;

        int c1=0;
        int c2=0;
        int c3=0;

        for(int i =0; i<n; i++){
            if(nums[i]==0){
                c1++;
            }
            else if(nums[i]==1){
                c2++;
            }
            else if(nums[i]==2){
                c3++;
            }
        }

            
            change(nums,0,c1,0);
            change(nums,c1,c2,1);
            change(nums,c1+c2,c3,2);

        




        //bubble sort Solution  O(n^2) solution
        // for(int i = 0; i<n; i++){
        //     for(int j = i; j<n; j++){
        //         if(nums[i]>nums[j]){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         }
        //     }
        // }
    }
}