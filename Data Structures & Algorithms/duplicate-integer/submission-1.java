class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean containsDup = false;
        Set<Integer> numSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(numSet.contains(curr)){
                return !containsDup;
            } else {
                numSet.add(curr);
            }
            
        }
        return containsDup;
    }
}