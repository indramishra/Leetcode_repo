class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int even = 0;
        for(int num : nums) {
            if(num%2 == 0) {
                even = even | num;
            }
        }
        return even;
    }
}