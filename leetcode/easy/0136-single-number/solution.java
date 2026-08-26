class Solution {
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

    public int singleNumber(int[] nums) {
        // Step 1: Sort to easily find the min and max values
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        
        // Step 2: Size the array to fit the entire range of numbers safely
        int range = max - min + 1;
        int arr[] = new int[range];

        // Step 3: Shift indices by subtracting 'min' to handle negative numbers
        for (int i : nums) {
            arr[i - min]++;
        }

        // Step 4: Find the element with a count of 1
        for (int i : nums) {
            if (arr[i - min] == 1) {
                return i; 
            }
        }
        return 0;
    }
}