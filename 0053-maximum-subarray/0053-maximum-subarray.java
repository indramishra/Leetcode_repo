class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i < nums.length; i++) {
            sum += nums[i];
            if(sum < 0) {
                maxSum = Math.max(sum, maxSum);
                sum = 0;
            } else {
                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
        
    }
}