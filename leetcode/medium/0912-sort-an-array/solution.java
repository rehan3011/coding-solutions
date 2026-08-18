class Solution {
    public int[] sortArray(int[] nums) {
        

        //wrong approach
        // int n = nums.length;
        // int freq[] = new int[n+2];
        
        // for(int num:nums){
        //     freq[num]++;
        // }
        // int k=0;
        // for(int j=0; j<freq.length; j++){
        //     while(freq[j]>0){
        //         nums[k++] = j;
        //         freq[j]--;
        //     }
        // }
        // return nums;

        mergeSort(nums);
        return nums;
    }

    public static void mergeSort(int[] arr){
        int len = arr.length;
        
        if(len<=1) return;
        int mid = len/2;
        int larr[] = new int[mid];
        int rarr[] = new int[len-mid];
        int i=0, l=0, r=0;
        for(; i<len; i++){
            if(i<mid){
                larr[l] = arr[i];
                l++;
            }
            else{
                rarr[r] = arr[i];
                r++;
            }
        }

        mergeSort(larr);
        mergeSort(rarr);
        merge(arr,larr,rarr);
    }
    
    public static void merge(int[] arr, int[] larr, int[] rarr){
        int lLen = larr.length;
        int rLen = rarr.length;
        int i=0, l=0, r=0;

        while(l<lLen && r<rLen){
            if(larr[l]<rarr[r]){
                arr[i] = larr[l];
                i++;
                l++;
            }
            else{
                arr[i] = rarr[r];
                i++;
                r++;
            }
        }

        while(l<lLen){
                arr[i] = larr[l];
                i++;
                l++; 
        }
        while(r<rLen){
            arr[i] = rarr[r];
            i++;
            r++;
        }
    }
}