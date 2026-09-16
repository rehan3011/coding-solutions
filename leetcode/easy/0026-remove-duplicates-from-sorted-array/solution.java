class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int j = 0;
        for (int i : nums) {
            if (set.contains(i))
                continue;
            set.add(i);
            nums[j] = i;
            j++;
        }

        return set.size();
    }
}