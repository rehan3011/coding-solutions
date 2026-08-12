class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1<n2){

        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;

        }
        else{

        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums2) {
            set1.add(num);
        }

        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int num : nums1) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;

        }

    }
}
