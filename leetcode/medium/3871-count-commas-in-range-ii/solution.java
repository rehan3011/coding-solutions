class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long c = n;
        int count = 0;
        long ccount = 0;
        while(c>0){
            c/=10;
            count++;
        }

        for(long i=1000; i<=n; i++){
            ccount++;
        }

        return ccount;
    }
}