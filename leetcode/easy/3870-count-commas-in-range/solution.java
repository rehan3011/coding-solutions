class Solution {


    public int countCommas(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i >= 1000) {
                count++;
            }
        }

        return count;
    }
    // public int countCommas(int n) {
    //     int count = 0;
    //     int c = n;

    //     while(c>0){
    //         c/=10;
    //         count++;
    //     }
    //     int comma = 0;
    //     if(count==4){
    //         for(int i=1000; i<=n; i++){
    //             comma++;
    //         }
    //     }
    //     return comma;
    // }
}