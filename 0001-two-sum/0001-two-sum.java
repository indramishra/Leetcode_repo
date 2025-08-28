class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> setStore = new ArrayList<>();
        for(int i=0; i<nums.length;i++) {
            int complement = target - nums[i];
            if(setStore.contains(complement)) {
                return new int[]{setStore.indexOf(complement),i};
            }
            setStore.add(nums[i]);
        }
        return new int[]{-1, -1};
    }
}