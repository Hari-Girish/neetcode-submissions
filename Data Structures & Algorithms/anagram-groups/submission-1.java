
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> soupToStr = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String currStr = strs[i];
            int[] alph = new int[26];

            // Count letter frequencies
            for (char currChar : currStr.toCharArray()) {
                int index = currChar - 'a';
                alph[index]++;
            }

            // Convert frequency array to key
            String key = Arrays.toString(alph);

            // Add to the map
            if (soupToStr.containsKey(key)) {
                soupToStr.get(key).add(currStr);
            } else {
                soupToStr.put(key, new ArrayList<>(List.of(currStr)));
            }
        }

        // Return grouped anagrams
        return new ArrayList<>(soupToStr.values());
    }
}
