class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List <Integer> list = new ArrayList<>();
        int max=arr[0];
        int min=arr[0];
        for(int i :arr){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int[] newarr = new int[max+1];
        for(int i: newarr){
            i=0;
        }
        for(int j: arr){
            newarr[j]++;
        }
        for(int k= min; k<max; k++){
            if(newarr[k] == 0){
                list.add(k);
            }
        }
        return list;
    }
}