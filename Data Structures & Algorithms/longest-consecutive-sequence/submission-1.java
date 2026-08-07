class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int max = 0;
        for(int num : numSet){
            if(!numSet.contains(num-1)){
                boolean noMore = false;
                int currMax = 1;
                int currNum = num;
                while(!noMore){
                    if(numSet.contains(currNum+1)){
                        currMax++;
                        currNum++;
                    } else {
                        noMore = true;
                    }
                }
                if(currMax > max){
                    max = currMax;
                }
            }
        }
        return max;
    }
}
