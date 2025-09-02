class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i : nums1) {
            for(int j : nums2) {
                map.merge(i+j, 1, Integer::sum);
            }
        }

        for(int k : nums3) {
            for(int l : nums4) {
                int complement = 0-(k+l);
               count+= map.getOrDefault(complement, 0);
            }
        }
        return count;
    }
        
}