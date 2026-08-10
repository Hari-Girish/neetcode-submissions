class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap that maps a char-count signature (charMap) to the list of indices in strs sharing that signature
        HashMap<HashMap<Character, Integer>, ArrayList<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            HashMap<Character, Integer> charMap = new HashMap<>();
            for (int j = 0; j < str.length(); j++) {
                char curr = str.charAt(j);
                charMap.put(curr, charMap.getOrDefault(curr, 0) + 1);
            }
            ArrayList<Integer> currIndex = indexMap.getOrDefault(charMap, new ArrayList<>());
            currIndex.add(i);
            indexMap.put(charMap, currIndex);
        }

        List<List<String>> finalList = new ArrayList<>();
        for (Map.Entry<HashMap<Character, Integer>, ArrayList<Integer>> entry : indexMap.entrySet()) {
            ArrayList<Integer> currList = entry.getValue();
            List<String> currStringList = new ArrayList<>();
            for (int idx : currList) {
                currStringList.add(strs[idx]);
            }
            finalList.add(currStringList);
        }
        return finalList;
    }
}