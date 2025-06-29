class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0;
       int prefixSum = 0;
       Map<Integer, Integer> prefixSumMap = new HashMap<Integer, Integer>();
       int remain = 0;
       prefixSumMap.put(0,1);
       for(int i = 0; i < nums.length; i++) {
           prefixSum += nums[i];
           remain = prefixSum - k;
            count += prefixSumMap.getOrDefault(remain,0);
           prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0)+1);
       }

       return count;
    }
}