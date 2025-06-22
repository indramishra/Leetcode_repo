class Solution {
    public int[] rearrangeArray(int[] nums) {
        int mid = nums.length/2;
        int[] positiveArray = new int[mid];
        int[] negativeArray = new int[mid];
        int positiveIndex = 0;
        int negativeIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                negativeArray[negativeIndex++] = nums[i];
            } else {
                positiveArray[positiveIndex++] = nums[i];
            }
        }
        positiveIndex = 0;
        negativeIndex = 0;
        for(int i = 0; i < nums.length; i++) {         
            if(i%2 == 0) {
                nums[i] = positiveArray[positiveIndex++];
            } else {
                nums[i] = negativeArray[negativeIndex++];
            }
            
        }
        return nums;
    }
}