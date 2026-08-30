class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n==1) return n;
        int minInx = 0;
        int maxInx = 0;
        for(int i=0; i<n; i++){
            if(nums[i]>nums[maxInx]){
                maxInx = i;
            }
            if(nums[i]<nums[minInx]){
                minInx = i;
            }
        }

        int left = Math.min(minInx,maxInx);
        int right = Math.max(minInx,maxInx);

        int fromFront = right + 1;
        
       
        int fromBack = n - left;
        
        
        int bothSides = (left + 1) + (n - right);
        
       
        return Math.min(fromFront, Math.min(fromBack, bothSides));


    }
}