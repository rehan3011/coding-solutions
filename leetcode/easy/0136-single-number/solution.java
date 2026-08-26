class Solution {

    //solution 1
    // public int singleNumber(int[] nums) {
    //     Map<Integer,Integer> mp = new HashMap<>();
    //     int n = nums.length;
    //     for(int i:nums){
    //         mp.put(i,mp.getOrDefault(i,0)+1);
    //     }
    //     for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
    //         if(entry.getValue()==1){
    //             return entry.getKey();
    //         }
    //     }
    //     return 0;
    // }

    // Wrong Approach
    // public int singleNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums[nums.length-1];
    //     int arr[] = new int[n+1];

    //     for(int i:nums){
    //         arr[i]++;
    //     }

    //     for(int j:nums){
    //         if(arr[j]==1){
    //             return j; 
    //         }
    //     }
    //      return 0;
    // }

    //Correct But Slow
    // public int singleNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     int min = nums[0];
    //     int max = nums[nums.length - 1];
        
    //     int range = max - min + 1;
    //     int arr[] = new int[range];


    //     for (int i : nums) {
    //         arr[i - min]++;
    //     }


    //     for (int i : nums) {
    //         if (arr[i - min] == 1) {
    //             return i; 
    //         }
    //     }
    //     return 0;
    // }

     public int singleNumber(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            index=index^nums[i];
        }
        
        return index;
     }

}