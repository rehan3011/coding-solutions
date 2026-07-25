class Solution {
    public int kthSmallest(int[] arr, int k) {
        
        // Brute Force Approach
        // TreeSet <Integer> tset = new TreeSet<>();
        
        // for(int i:arr){
        //     tset.add(i);
        // }
        
        // if(k>tset.size()) return -1;
        
        // int count =1;
        // for(int i: tset){
        //     if(count == k){
        //         return i;
        //     }
        //     count++;
        // }
        // return -1;
        
        Arrays.sort(arr);
        return arr[k-1];
    }
}
