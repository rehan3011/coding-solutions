class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int start = 1;

        for(int i:nums){
            if(i>0&&i==start){
                start++;
            }
            else if(i>start){
                return start;
            }
        }
        return start;
    }
}