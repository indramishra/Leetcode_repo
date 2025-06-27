class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int maxSeqLen = 1;
        Set<Integer> st = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }

       for(int elem : st) {
        if(!st.contains(elem - 1)) {
            int count = 1;
            int startSeq = elem;
            while(st.contains(startSeq+1)) {
                count +=1;
                startSeq +=1;
            }
           maxSeqLen = Math.max(count, maxSeqLen); 
        }
       }
        return maxSeqLen;
    }
}