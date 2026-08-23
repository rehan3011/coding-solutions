class Solution {
    public boolean isPalindromic(String s) {
        if(s.length()==1||s.length()==0){
            return true;
        }
    StringBuilder add = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            add.append(Integer.toBinaryString(s.charAt(i)));
        }
        int left =0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}