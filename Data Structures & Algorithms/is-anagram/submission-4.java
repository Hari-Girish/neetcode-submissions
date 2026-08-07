class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() == t.length()) {

            HashMap<Character, Integer> charInt_S = new HashMap<>();
            HashMap<Character, Integer> charInt_T = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);
                char charT = t.charAt(i);

                charInt_S.put(charS, charInt_S.getOrDefault(charS, 0) + 1);
                charInt_T.put(charT, charInt_T.getOrDefault(charT, 0) + 1);
            }

            return charInt_S.equals(charInt_T);

        } else {
            return false;
        }
    }
}