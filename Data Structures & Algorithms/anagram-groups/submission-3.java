

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int c : count) {
                sb.append((char) c); // pack each count as a char, no delimiter needed
            }
            map.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}