class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0, currArea = 0, right = height.length - 1;
        while(left < right) {
             if(height[left] < height[right]) {
               currArea = (right - left)*height[left];
               if(maxArea < currArea){
                 maxArea = currArea;
               }
               left++; 
            } else {
                currArea = (right - left)*height[right];
                if(maxArea < currArea){
                   maxArea = currArea;
               }
                right--;
            }
            
           
        }
        
       return maxArea;
    }
}