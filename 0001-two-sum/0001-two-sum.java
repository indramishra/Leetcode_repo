class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> storeArr = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i < nums.length;i++) {
            int diff = target - nums[i];
            if(storeArr.containsKey(diff)) {
                result[0] = storeArr.get(diff);
                result[1] = i;
                return result;
            }
            storeArr.put(nums[i], i);
        }
        return result;
    }
}