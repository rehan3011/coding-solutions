class Solution {
public int[] sortArray(int[] nums) {
    heapsort(nums);
    return nums;
    }

    public static void heapsort(int[] arr){
        int n = arr.length;

        for(int i=n/2-1; i>=0; i--){
            heapify(arr,n,i);
        }

        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }

    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n&&arr[left]>arr[largest]) largest = left;
        if(right<n&&arr[right]>arr[largest]) largest = right;

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}


//     //mergesort approach
//     public int[] sortArray(int[] nums) {
        
//         mergeSort(nums);
//         return nums;
//     }

//     public static void mergeSort(int[] arr){
//         int len = arr.length;
        
//         if(len<=1) return;
//         int mid = len/2;
//         int larr[] = new int[mid];
//         int rarr[] = new int[len-mid];
//         int i=0, l=0, r=0;
//         for(; i<len; i++){
//             if(i<mid){
//                 larr[l] = arr[i];
//                 l++;
//             }
//             else{
//                 rarr[r] = arr[i];
//                 r++;
//             }
//         }

//         mergeSort(larr);
//         mergeSort(rarr);
//         merge(arr,larr,rarr);
//     }
//     public static void merge(int[] arr, int[] larr, int[] rarr){
//         int lLen = larr.length;
//         int rLen = rarr.length;
//         int i=0, l=0, r=0;

//         while(l<lLen && r<rLen){
//             if(larr[l]<rarr[r]){
//                 arr[i] = larr[l];
//                 i++;
//                 l++;
//             }
//             else{
//                 arr[i] = rarr[r];
//                 i++;
//                 r++;
//             }
//         }

//         while(l<lLen){
//                 arr[i] = larr[l];
//                 i++;
//                 l++; 
//         }
//         while(r<rLen){
//             arr[i] = rarr[r];
//             i++;
//             r++;
//         }
//     }
// }

// // quicksort approach
    
//     // public int[] sortArray(int[] nums) {
//     //     int n = nums.length;
//     //     int low = 0;
//     //     int high = n-1;
//     //     quickSort(nums, low, high);
//     //     return nums;
//     // }

//     // public static void quickSort(int[] arr, int low, int high){
//     //     if(low<high) {
//     //         int pivot = partition(arr, low, high);

//     //         quickSort(arr, low, pivot-1);
//     //         quickSort(arr,pivot+1,high);
//     //     }
//     // }
    
//     // public static int partition(int[] arr, int low, int high){
//     //     int pivot = arr[high];
//     //     int i = low-1;

//     //     for(int j=low; j<high; j++){
//     //         if(arr[j]<=pivot){
//     //             i++;
//     //             int temp = arr[i];
//     //             arr[i] = arr[j];
//     //             arr[j] = temp;
//     //         }
//     //     }
//     //     int temp = arr[i+1];
//     //     arr[i+1] = arr[high];
//     //     arr[high] = temp;
//     //     return i+1;
//     // }


//         //wrong approach
//         // int n = nums.length;
//         // int freq[] = new int[n+2];
        
//         // for(int num:nums){
//         //     freq[num]++;
//         // }
//         // int k=0;
//         // for(int j=0; j<freq.length; j++){
//         //     while(freq[j]>0){
//         //         nums[k++] = j;
//         //         freq[j]--;
//         //     }
//         // }
//         // return nums;