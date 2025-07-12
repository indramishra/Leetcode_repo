class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSumMap = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            int twoSumComplement = target - nums[i];
            if(twoSumMap.containsKey(twoSumComplement)) {
                return new int[]{twoSumMap.get(twoSumComplement), i};
            }
            twoSumMap.put(nums[i], i);
        }

        return new int[] {};
    }
}