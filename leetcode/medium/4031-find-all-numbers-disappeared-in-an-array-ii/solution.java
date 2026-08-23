import java.util.*;

class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        
        Set<Integer> presentNumbers = new HashSet<>();
        for (int num : nums) {
            presentNumbers.add(num);
        }

        List<List<Integer>> result = new ArrayList<>();
        int startMissing = -1;

        
        for (int i = lower; i <= upper; i++) {
            if (!presentNumbers.contains(i)) {
                
                if (startMissing == -1) {
                    startMissing = i;
                }
            } else {
                
                if (startMissing != -1) {
                    result.add(Arrays.asList(startMissing, i - 1));
                    startMissing = -1; 
                }
            }
        }

       
        if (startMissing != -1) {
            result.add(Arrays.asList(startMissing, upper));
        }

        return result;
    }
}
