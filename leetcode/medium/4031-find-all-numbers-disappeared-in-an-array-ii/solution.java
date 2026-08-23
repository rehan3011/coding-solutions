import java.util.*;

class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] arr, int lower, int upper){
        Arrays.sort(arr);
        List<List<Integer>> ls = new ArrayList<>();
        int n =arr.length;

        int start =lower;

        for(int i=0; i<n; i++){
            if(arr[i]<start){
                continue;
            }

            if(arr[i]>upper){
                break;
            }

            if(arr[i]>start){
                ls.add(Arrays.asList(start, arr[i]-1));
            }
            start = arr[i]+1;
        }

        if(start<=upper){
            ls.add(Arrays.asList(start, upper));
        }

        return ls;
        
    }
    // fast Approach
    // public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
    //     Set <Integer> hs = new HashSet<>();
    //     List<List<Integer>> ls = new ArrayList<>();
    //     int i = lower;
    //     for(int j:nums){
    //         hs.add(j);
    //     }
    //     while(i <= upper){
    //         if(hs.contains(i)){
    //             i++;
    //             continue;
    //         }
    //         int start = i;
    //         while(i<=upper && !hs.contains(i)){
    //             i++;
    //         }
    //         int high = i-1;
    //         ls.add(Arrays.asList(start,high));
    //     }
    //     return ls;
    // }

    // faster approach
    // public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        
    //     Set<Integer> presentNumbers = new HashSet<>();
    //     for (int num : nums) {
    //         presentNumbers.add(num);
    //     }

    //     List<List<Integer>> result = new ArrayList<>();
    //     int startMissing = -1;

        
    //     for (int i = lower; i <= upper; i++) {
    //         if (!presentNumbers.contains(i)) {
                
    //             if (startMissing == -1) {
    //                 startMissing = i;
    //             }
    //         } else {
                
    //             if (startMissing != -1) {
    //                 result.add(Arrays.asList(startMissing, i - 1));
    //                 startMissing = -1; 
    //             }
    //         }
    //     }

       
    //     if (startMissing != -1) {
    //         result.add(Arrays.asList(startMissing, upper));
    //     }

    //     return result;
    // }
}
