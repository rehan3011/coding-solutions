class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);

        List <Integer> list = new ArrayList<>();
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                list.add(nums[i]);
                i++;
            }
        }
        return list;
    }
}