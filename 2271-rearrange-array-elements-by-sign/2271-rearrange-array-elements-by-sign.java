class Solution {
    public int[] rearrangeArray(int[] nums) {       
        int positiveIndex = 0;
        int negativeIndex = 1;
        int[] arrangedArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                arrangedArray[negativeIndex] = nums[i];
                negativeIndex += 2;

            } else {
                arrangedArray[positiveIndex] = nums[i];
                positiveIndex += 2;
            }
        }
        
        return arrangedArray;
    }
}