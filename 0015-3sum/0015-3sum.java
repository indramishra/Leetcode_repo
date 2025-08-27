class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<> ();

        for(int i=0; i< nums.length;i++) {
            Map<Integer, Integer> map = new HashMap<> ();
            int target = 0 - nums[i];
           for(int j=i+1;j < nums.length;j++) {
                int compliment = target - nums[j];
               if(map.containsKey (compliment)) {
                   List<Integer> list = Arrays.asList (nums[i],nums[j],compliment);
                   list.sort (null);
                  ans.add (list);
               } else {
                   map.put (nums[j], j);
               }

           }
        }
                return new ArrayList<> (ans);
    }
}