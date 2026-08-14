class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length;

        int l = 0;
        int h = n-1;
        

        while(l<=h){
            int mid = (l+h)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                h = mid-1;
              
            }
            else {
                l = mid+1;
                
            }
        }

        return l;


    }
}