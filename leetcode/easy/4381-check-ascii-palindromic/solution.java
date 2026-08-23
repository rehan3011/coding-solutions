class Solution {
    public boolean isPalindromic(String s) {
    StringBuilder add = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            String b = String.format("%8s", 
                Integer.toBinaryString(s.charAt(i)))
                .replace(' ', '0');
            add.append(b);
        }
        int left =0;
        int right = add.length()-1;
        while(left<right){
            if(add.charAt(left)!=add.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}