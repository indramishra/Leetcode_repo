class Solution {
    public int findMin(int[] nums) {
        int len = nums.length - 1;
        int minLeft = binarySearch(nums, true);
        int minRight = binarySearch(nums, false);
        return Math.min(minLeft, minRight);
    }

    public int binarySearch(int[] nums, boolean findFirst) {
        int start = 0, end = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while(start <= end) {
            int mid = start + (end - start)/2;
            min = Math.min(nums[mid], min);
            if(findFirst) {
                if(nums[start] <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(nums[mid] >= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return min;
    }
}