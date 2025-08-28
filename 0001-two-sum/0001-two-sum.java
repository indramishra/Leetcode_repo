class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapStore = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            int complement = target - nums[i];
            if(mapStore.containsKey(complement)) {
                return new int[]{mapStore.get(complement),i};
            }
            mapStore.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}