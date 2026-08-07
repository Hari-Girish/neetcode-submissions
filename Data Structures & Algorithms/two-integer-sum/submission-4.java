class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (numsMap.containsKey(diff)) {
                int j = numsMap.get(diff);
                return new int[]{j, i};
            }

            numsMap.put(nums[i], i);
        }

        return new int[]{}; // no solution found
    }
}
