class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char currSchar = s.charAt(i);
            char currTchar = t.charAt(i);
            int currSvalue = 0;
            int currTvalue = 0;
            if(sMap.containsKey(currSchar)){
                currSvalue = sMap.get(currSchar)+1;
            }
            if(tMap.containsKey(currTchar)){
                currTvalue = tMap.get(currTchar)+1;
            }
            sMap.put(currSchar, currSvalue);
            tMap.put(currTchar, currTvalue);
        }
        return sMap.equals(tMap);
    }
}
