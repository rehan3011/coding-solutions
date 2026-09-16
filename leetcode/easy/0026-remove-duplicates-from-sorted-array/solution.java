class Solution {
    public int removeDuplicates(int[] nums) {
    
        int j = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }

        //solution 1
        // Set<Integer> set = new HashSet<Integer>();
        // int j = 0;
        // for (int i : nums) {
        //     if (set.contains(i))
        //         continue;
        //     set.add(i);
        //     nums[j] = i;
        //     j++;
        // }

        // return set.size();

        return j;
    }
    
}