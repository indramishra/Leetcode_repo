class Solution {
    public List<List<Integer>> generate(int numRows) { //generate pascal triangle 
        List<List<Integer>> resultPascal = new ArrayList<List<Integer>>();
        List<Integer> firstRow = new ArrayList<Integer>();
        if(numRows <= 0) {
            return resultPascal;
        }
        firstRow.add(1); 
        resultPascal.add(firstRow);//add first Row to Pascal triangle
        for(int i=1; i<numRows;i++) {
            List<Integer> prevRow = resultPascal.get(i-1); // get the previous row of Pascal Triangle
            List<Integer> currRow = new ArrayList();
            currRow.add(1);// first digit of the current row will always be 1.
            for(int j=1; j<i; j++) {
                currRow.add(prevRow.get(j-1) + prevRow.get(j));//add adjacent values of the previous row to get the value of current row.
            }
            currRow.add(1);// last digit of the current row will always be 1.
            resultPascal.add(currRow);
        }

        

        return resultPascal;
    }
   
}