class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = nums.length;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = (high + low)/2;
            if(target == nums[mid]) {
                return mid;
            }
            if(target <= nums[mid]) {
                index = mid;
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

   
}