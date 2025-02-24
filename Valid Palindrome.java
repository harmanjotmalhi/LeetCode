class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        String t = reverseString(s);

        if(s.equals(t)) return true;
        else return false;
    }

    public String reverseString(String temp){

        String ret = "";
        for(int i = temp.length()-1; i >= 0; i--){
            ret = ret + temp.charAt(i);
        }

        return ret;
    }
}
