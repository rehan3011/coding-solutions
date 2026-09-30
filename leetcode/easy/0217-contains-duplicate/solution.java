class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set <Integer> set = new HashSet<>();
        int n = nums.length;

        for(int i:nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }

        return false;
        
        
        //solution 1
        // int n = nums.length;
        // Arrays.sort(nums);

        // for(int i=0; i<n-1; i++){
        //     if(nums[i]-nums[i+1]==0){
        //         return true;
        //     }
        // }
        // return false;
    }
}