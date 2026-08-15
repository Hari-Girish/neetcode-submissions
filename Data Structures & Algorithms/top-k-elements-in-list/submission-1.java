class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Count how often each number appears using a hash map
        HashMap<Integer, Integer> intToFrequency = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            intToFrequency.put(nums[i], intToFrequency.getOrDefault(nums[i], 0) + 1);
        }
        List<List<Integer>> bucketList = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++){
            bucketList.add(new ArrayList<>());
        }
        intToFrequency.forEach((key, value) -> {
            bucketList.get(value).add(key);
        });
        int[] result = new int[k];
        int resultIdx = 0;
        int kFound = 0;
        int i = bucketList.size() - 1;
        while(kFound != k){
            for(int num : bucketList.get(i)){
                result[resultIdx++] = num;
                kFound++;
            }
            i--;
        }
        return result;
    }
}
