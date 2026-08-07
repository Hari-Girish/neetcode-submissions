class Solution {

    public String encode(List<String> strs) {
        String finalStr = "";
        for(int i = 0; i < strs.size(); i++){
            String seperator = strs.get(i).length() + "#";
            finalStr = finalStr + seperator + strs.get(i);
        }
        return finalStr;
    }

    public List<String> decode(String str) {
        List<String> finalList = new ArrayList<>();
        while(str.length() > 1){
            int index = str.indexOf("#");
            if(index == -1) break;
            String indexStr = str.substring(0, index);
            int length = Integer.parseInt(indexStr);
            String currStr = str.substring(index+1, index+1+length);
            str = str.substring(index+1+length);
            finalList.add(currStr);
        }
        return finalList;
    }
}
