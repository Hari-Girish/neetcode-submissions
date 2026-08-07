class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int[] returnArr = new int[2];
        for(int i = 0; i < nums.length; i++){
            int currNum = nums[i];
            int valNeeded = target-currNum;
            if(numsMap.containsKey(valNeeded)){
                returnArr = new int[]{numsMap.get(valNeeded), i};
                break;
            } else {
                numsMap.put(currNum, i);
            }
        }
        return returnArr;
    }
}
