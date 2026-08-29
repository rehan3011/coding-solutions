class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Set <Integer> set = new HashSet<>();

        int n = nums.length;

        for(int i:nums){
            if(i>0){
                set.add(i);
            }
        }
        int start = 1;
        for(int j:set){
            if(set.contains(start)){
                start++;
            }
            else{
                return start;
            }
        }
        return start;
        
        //solution 1
        // int n = nums.length;
        // Arrays.sort(nums);
        // int start = 1;

        // for(int i:nums){
        //     if(i>0&&i==start){
        //         start++;
        //     }
        //     else if(i>start){
        //         return start;
        //     }
        // }
        // return start;
    }
}