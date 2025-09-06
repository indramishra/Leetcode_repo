class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int j = height.length - 1;
        int i=0;
        while(i < j) {
            int areaWidth = j - i;
            int areaHeight = Math.min(height[i],height[j]);
            int currArea = areaWidth*areaHeight;
            if(maxArea < currArea) {
                maxArea = currArea;
            }
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        
       return maxArea;
    }
}