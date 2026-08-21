class Solution {
    public List<String> letterCombinations(String s) {
        List <String> str = new ArrayList<>();

        if(s.length()==0) return str;

        int n = s.length();
        str.add("");
        for(int i=0; i<n; i++){
            String s1 = check(s.charAt(i));
            List <String> temp = new ArrayList<>();
            for(String exist:str){
                for(int j=0; j<s1.length(); j++){
                    temp.add(exist+s1.charAt(j));
                }
            }

            str = temp;
            
        }
            return str;
    }

    public static String check(char ch){
        if(ch =='2') return "abc";
        else if(ch == '3') return "def";
        else if(ch == '4') return "ghi";
        else if(ch == '5') return "jkl";
        else if(ch == '6') return "mno";
        else if(ch == '7') return "pqrs";
        else if(ch == '8') return "tuv";
        else if(ch == '9') return "wxyz";
        return "";
    }
}