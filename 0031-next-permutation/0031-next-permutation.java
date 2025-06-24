class Solution {
    public void nextPermutation(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int positionIndex = -1;
        int arrLen = nums.length - 1;
        for(int i=arrLen-1; i >=0; i--) {
            if(nums[i] < nums[i+1]) {
                positionIndex = i;
                break;
            }
        }

        if(positionIndex == -1) {
            reverseArray(nums,0,arrLen);
            return;
        }

        for(int i=arrLen;i>=positionIndex;i--) {
            if(nums[i] > nums[positionIndex]){
                int diff = nums[i] - nums[positionIndex];
                if(min > diff) {
                    min = diff;
                    minIndex = i;
                }
            }
        }

        int temp = nums[positionIndex];
        nums[positionIndex] = nums[minIndex];
        nums[minIndex] = temp;
        reverseArray(nums,positionIndex+1,arrLen);

    }

    public void reverseArray(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }
}