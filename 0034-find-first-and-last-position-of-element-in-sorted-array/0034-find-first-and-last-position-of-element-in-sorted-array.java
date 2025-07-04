class Solution {
    public int[] searchRange(int[] nums, int target) {
        int minPos = binarySearch(nums, target, true);
        int maxPos = binarySearch(nums, target, false);
        return new int[]{minPos, maxPos};
    }

    public int binarySearch(int[] nums, int target, boolean findFirst) {
        int index = -1;
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] < target) {
                start = mid+1;
            } else if(nums[mid] > target) {
                end = mid-1;
            } else {
                index = mid;
                if(findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}