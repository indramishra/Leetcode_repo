class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE, low = 0, high = height.length - 1;
        while(low < high) {
            int width = high - low;
            int currArea = Math.min(height[low],    height[high])*width;
            maxArea = Math.max(currArea, maxArea);
            if(height[low] < height[high]) {
                low++;
            }else {
                high--;
            }
        }
        return maxArea;
    }
}