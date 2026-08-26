class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
}