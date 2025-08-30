class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<> ();
        Arrays.sort (nums);
        int len = nums.length -1;
       for(int i = 0; i<=len;i++) {
           if(i>0 && nums[i] == nums[i-1]){
               continue;
           }
           for(int j=i+1;j<= len;j++) {
               if(j>i+1 && nums[j] == nums[j-1]) {
                   continue;
               }
                int left = j+1, right =  len;
               int sum = nums[i]+nums[j];
               while(left < right) {
                   long currentTarget = (long)sum+nums[left]+nums[right];
                   if(currentTarget == target) {
                       ans.add(Arrays.asList (nums[i],nums[j],nums[left],nums[right]));
                       left++;
                       right--;
                       while(left < right && nums[left] == nums[left-1]){left++;}
                       while(left < right && nums[right] == nums[right+1]){right--;}
                   } else if(currentTarget < target) {
                       left++;
                   }else {
                       right--;
                   }
               }
           }
       }
       return ans;
    }
        
}