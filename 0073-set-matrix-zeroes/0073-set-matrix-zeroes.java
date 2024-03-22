class Solution {
    public void setZeroes(int[][] matrix) {
        int numberOfRows = matrix.length; //number of rows in the given matrix
        int colnumberOfColumns = matrix[0].length; //number of columns in the given matrix
        /*
        creating two arrays of lenght of rows and columns respectively.
        These will store positions where zero's exist in the matrix.
         */
        int[] rowArr = new int[numberOfRows]; 
        int[] colArr = new int[colnumberOfColumns];
        for(int i=0;i<numberOfRows;i++) {
            for(int j=0;j<colnumberOfColumns;j++){
                /*
                save the position of zero in the matrix, 
                and the indexes in the row and columns respectivaly
                 */
                if(matrix[i][j] == 0) {
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }

            }
        }
       /* 
       set the entire row and column to zero, 
       corresponding to the positions save into rowArr and colArr.
       */
        for(int i=0; i<numberOfRows;i++) {
            for(int j=0; j<colnumberOfColumns; j++) {
                if(rowArr[i]==1 || colArr[j]==1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}