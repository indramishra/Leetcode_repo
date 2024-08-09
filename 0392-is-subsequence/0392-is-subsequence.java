class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] charArrSuper = t.toCharArray();
        char[] charArrSub = s.toCharArray();
        List<Integer> checkSubArr = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (j < s.length() && charArrSub[j] == charArrSuper[i]) {
                 checkSubArr.add(i);
                j++;
            }
        }
        if(charArrSub.length != checkSubArr.size()) {
            return false;
        }
        for(int i=0; i < checkSubArr.size(); i++) {
            if(i+1 < checkSubArr.size() && checkSubArr.get(i) > checkSubArr.get(i+1)) {
                return false;
            }
        }
        return true;
    }

}