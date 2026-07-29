class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[p] = arr[i] * arr[i];
                i++;
            } else {
                result[p] = arr[j] * arr[j];
                j--;
            }
        }
        return result;
    }
}