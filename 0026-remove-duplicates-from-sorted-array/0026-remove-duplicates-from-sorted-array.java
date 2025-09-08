class Solution {
     public static int removeDuplicates(int[] nums) {
        int count = 0,i=0,j=1;
        while(j < nums.length) {
                if(nums[i] != nums[j]){
                    i++;
                    nums[i] = nums[j];
                    count++;
                } else {
                j++;
            }
        }
        return count+1;
    }
}