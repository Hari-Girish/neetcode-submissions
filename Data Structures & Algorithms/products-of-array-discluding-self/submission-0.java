class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        int currPrefProd = nums[0];
        int currSuffProd = nums[nums.length-1];
        pref[0] = 1;
        suff[nums.length-1] = 1;
        for(int i = 1;i < nums.length; i++){
            if(i == 1){
                pref[i] = currPrefProd;
                suff[nums.length-1-i] = currSuffProd;
            } else {
                currPrefProd = currPrefProd * nums[i-1];
                currSuffProd = currSuffProd * nums[nums.length-i];
                pref[i] = currPrefProd;
                suff[nums.length-1-i] = currSuffProd;
            }
        }
        for(int i = 0; i < nums.length; i++){
            prod[i] = pref[i] * suff[i];
        }
        return prod;
    }
}  
