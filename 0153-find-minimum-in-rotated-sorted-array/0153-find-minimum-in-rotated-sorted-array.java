class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while(start <= end) {
            if(nums[start] <= nums[end]) {
                min = Math.min(min, nums[start]);
                return min;
            }
            int mid = start + (end - start)/2;

            if(nums[start] <= nums[mid]) {
                min = Math.min(min, nums[start]);
                start = mid + 1;
            } else {
                min = Math.min (min, nums[mid]);
                
                end = mid - 1;
            }
        }
        return min;
    }
}