class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] boolrow = new boolean[row];
        boolean[] boolcol = new boolean[col];
        boolean isEmpty = true;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    boolrow[i] = true;
                    boolcol[j] = true;
                   // isEmpty = false;

                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(boolrow[i]||boolcol[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }   
}

    
