class Solution {
    public int maxArea(int[] height) {
        int len = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        int i = 0, currArea = 0;
        while(i < len) {
             if(height[i] < height[len]) {
               currArea = (len - i)*height[i];
               if(maxArea < currArea){
                 maxArea = currArea;
               }
               i++; 
            } else {
                currArea = (len - i)*height[len];
                if(maxArea < currArea){
                   maxArea = currArea;
               }
                len--;
            }
            
           
        }
        
       return maxArea;
    }
}