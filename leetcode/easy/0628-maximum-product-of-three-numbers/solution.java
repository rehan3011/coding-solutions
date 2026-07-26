class Solution {
    public int maximumProduct(int[] arr) {
        // int n = arr.length;
        // int maxValue1 = 1;
        // int maxValue2 = 1;
        // int j = 1;
        // int ans =1;
        // int count = 0;
        // for(int i=0; i<n-2; i++){
        //     maxValue1 = Math.abs(arr[i]*arr[j]);
        //     maxValue2 = Math.abs(maxValue1*arr[j+1]);
        //     ans  = Math.max(maxValue1,maxValue2);
        //     if(arr[i]<0||arr[j]<0||arr[j+1]<0){
        //         count++;
        //     }
        //     j++;

        // }
        // if(count>0){
        //     return ans*-1;
        // }
        // return ans;
        Arrays.sort(arr);
        int n = arr.length;

        int product1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int product2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(product1, product2);
    }
}