class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int j:nums){
            if(set.contains(j)){
                return j;
            }
            set.add(j);
        }
        return 0;
    }
}