class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        for(int i = 0; i < s.length()/2; i++){
            char start = s.charAt(i);
            char last = s.charAt(s.length()-1-i);
            if(start != last){
                return false;
            }
        }
        return true;
    }
}
