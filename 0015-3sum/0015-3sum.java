class Solution {
     public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort (nums);
        List<List<Integer>> ans = new ArrayList<> ();
        for(int i=0; i< nums.length;i++) {
            if(i!=0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = 0 - nums[i];
            int low = i+1;
            int high = nums.length - 1;
            while(low < high) {
                int currentTarget = nums[low] + nums[high];
                if(currentTarget == target) {
                    ans.add(Arrays.asList (nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]){low = low+1;}
                    while(low < high && nums[high] == nums[high + 1]){high = high -1;}
                } else if(currentTarget < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return ans;
    }
}