class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = res[i - 1] * nums[i - 1];
    }
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= right;
        right *= nums[i];
    }
    return res;
        // wrong approach
        // int n = nums.length;
        // int product = 1;
        // for(int i=0; i<n; i++){
        //     product*=nums[i];
        // }

        // int arr[] = new int[n];

        // for(int i=0; i<n; i++){
        //     try{
        //     arr[i] = product/nums[i];
        //     }
        //     catch (ArithmeticException e){
        //         arr[i] = 0;
        //     }
        // }
        // return arr;
    }
}