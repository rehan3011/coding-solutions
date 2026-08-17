class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        HashMap <Integer, Integer> hm = new  HashMap<>();

        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        for(int i:hm.keySet()){
            if(hm.get(i)>n/2) return i;
        }

        return -1;
    }
}