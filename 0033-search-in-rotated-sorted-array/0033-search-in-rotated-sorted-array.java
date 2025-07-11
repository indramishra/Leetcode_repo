class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[low] <= nums[mid]) {
                //if left part of the array is sorted
                if(nums[low] <= target && target <= nums[mid])
                {                    
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                } else {
                    //if right part of the array is sorted
                    if(nums[mid] <= target && target <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                if(nums[mid] == target) {
                    index = mid;
                }
        }
        return index;
    }
}