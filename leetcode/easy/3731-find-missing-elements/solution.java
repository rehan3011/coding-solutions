class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList <Integer> list = new ArrayList<>();
        int curr = arr[0];

        for(int i = 0; i<n; curr++, i++){
            if(curr<arr[i]){
                list.add(curr);
                i--;
            }
        }

        return list;
    }
}