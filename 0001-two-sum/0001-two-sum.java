class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSumMap = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            int twoSum = target - nums[i];
            if(twoSumMap.containsKey(twoSum)) {
                return new int[]{twoSumMap.get(twoSum), i};
            }
            twoSumMap.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}