class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (int i = 0; i < strs.size(); i++) {
            String curr = strs.get(i);
            int currLength = curr.length();
            String currEncoded = currLength + "#" + curr;
            result += currEncoded;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int hashIndex = str.indexOf('#');
        while (hashIndex != -1) {
            int currLength = Integer.parseInt(str.substring(0, hashIndex));
            String curr = str.substring(hashIndex + 1, hashIndex + 1 +currLength);
            result.add(curr);
            str = str.substring(hashIndex + 1 + currLength);
            hashIndex = str.indexOf('#');
        }
        return result;
    }
}
