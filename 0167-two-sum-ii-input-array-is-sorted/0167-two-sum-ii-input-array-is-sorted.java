class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length - 1;
        while(i<j){
            int currentTarget = numbers[i]+numbers[j];
            if(currentTarget == target) {
                return new int[]{i+1,j+1};
            } else if(currentTarget < target) {
                i++;
            } else {
                j--;
            }
        }
       return new int[]{-1,-1}; 
    }
}