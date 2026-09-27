class Solution {
    public int majorityElement(int[] nums) {
        Set <Integer> set = new HashSet<Integer>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        int count=0;

        for(int j = 0; j<n ;j++){
            count = 0;
            for(int k = 0; k<n; k++){
                if(set.contains(nums[j])){
                    count++;
                }
                if(count>=n/2){
                    return nums[j];
                }
            }
        }
        return 0;
    }
}