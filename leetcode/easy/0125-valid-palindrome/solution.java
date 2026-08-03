class Solution {
    public boolean isPalindrome(String s) {
        //optimal solution

        


        // Brute Force Approach
  String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int n = str.length();
    int start = 0 ;
    int end = n - 1;
    while(start < end){
        if(str.charAt(start) != str.charAt(end)){
            return false ;
        }
            start++ ;
            end -- ;
        }
    return true ;

    }
}