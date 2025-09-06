class Solution {
    public int maxArea(int[] height) {
        int len = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        while(i < len) {
             if(height[i] < height[len]) {
               if(maxArea < (len - i)*height[i]){
                 maxArea = (len - i)*height[i];
               }
               i++; 
            } else {
                if(maxArea < (len - i)*height[len]){
                   maxArea = (len - i)*height[len];
               }
                len--;
            }
            
           
        }
        
       return maxArea;
    }
}