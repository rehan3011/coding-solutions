class Solution {
    public int majorityElement(int[] nums) {
        // Set <Integer> set = new HashSet<Integer>();
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     set.add(nums[i]);
        // }
        // int count=0;

        // for(int j = 0; j<n ;j++){
        //     count = 0;
        //     for(int k = 0; k<n; k++){
        //         if(nums[k]==nums[j]){
        //             count++;
        //         }
        //         if(count>n/2){
        //             return nums[j];
        //         }
        //     }
        // }
        // return 0;

        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;

    }
}