class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }

        int arr1[] = new int[n+1];
        arr1[0]=1;

        return arr1;

        // long dig =0;
        // for(int nums: arr){
        //     dig = dig*10+nums;
        // }

        // dig = dig+1;

        // int len = Long.toString(dig).length();

        // int digits[] = new int[len];

        // for(int j=len-1; j>=0; j--){
        //     digits[j] =(int) dig%10;
        //     dig/=10;
        // }

        // return digits;
    }
}