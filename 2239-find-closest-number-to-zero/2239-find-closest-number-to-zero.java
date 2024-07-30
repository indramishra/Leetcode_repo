class Solution {
    public int findClosestNumber(int[] nums) {  
        int distance = Integer.MAX_VALUE;
        int result = 0;
        if(nums.length == 1) {
            return nums[0];
        }
        for(int i = 0; i< nums.length; i++) {
        if(Math.abs(nums[i]) < distance || nums[i] == Math.abs(distance)) {
            distance = Math.abs(nums[i]);
            result = nums[i];
        } 
        
    } 
        return result;
    }   
    
}