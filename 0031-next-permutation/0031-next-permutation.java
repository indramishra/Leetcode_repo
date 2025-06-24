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

        swap(nums,positionIndex,minIndex);
        reverseArray(nums,positionIndex+1,arrLen);

    }

    public void reverseArray(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        swap(arr,start,end);
        reverseArray(arr, start+1, end-1);
    }

    public void swap(int[] arr, int i, int j) {
         int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}