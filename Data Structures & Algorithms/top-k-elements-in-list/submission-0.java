class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //returning an arr[k]
        //int[] topk \
        //start at i = k and declare first k elements in topk[]
        //Map int to occurences
        //Every Iteration
        int[] topK = new int[k];
        Set<Integer> topKset = new HashSet<>();
        //topKset keeps track of what many nums are in topk
        Map<Integer, Integer> numToOcc = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int currNum = nums[i];
            boolean isInMap = numToOcc.containsKey(currNum);

            //Old Number!
            if(isInMap){
                //Updating Map
                numToOcc.put(currNum, numToOcc.get(currNum)+1);
                //Updates topK if currNum is not in topK and topK is full
                if(!topKset.contains(currNum) && topKset.size() == k){
                    //Finding num with smallest occ in topK
                    int minIndex = 0;
                    int minOcc = numToOcc.get(topK[0]);
                    for(int j = 1; j < k; j++){
                        int currOcc = numToOcc.get(topK[j]);
                        if(currOcc < minOcc){
                            minOcc = currOcc;
                            minIndex = j;
                        }
                    }
                    if(minOcc < numToOcc.get(currNum)){
                        topKset.remove(topK[minIndex]);
                        topKset.add(currNum);
                        topK[minIndex] = currNum;
                    }
                }
            } else /* New Number! */{
                if(topKset.size() < k){
                    topK[topKset.size()] = currNum;
                    topKset.add(currNum);
                }
                numToOcc.put(currNum, 1);
            }
        }
        return topK;
    }
}
