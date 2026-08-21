class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int total = 0;
        for(int i=0; i<n; i++){
            int current = check(s.charAt(i));
            if (i + 1 < n && current < check(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }

    public static int check(char ch){
        
        if(ch=='I')  return 1;
        else if(ch=='V') return 5;
        else if(ch=='X')  return 10;
        else if(ch=='L') return 50;
        else if(ch=='C')  return 100;
        else if(ch=='D')  return 500;
        else if(ch=='M') return 1000;
        return 0;
    }
}