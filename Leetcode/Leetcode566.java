package Leetcode;

public class Leetcode566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row =0;
        int col =0;
        int ans[][] = new int[r][c];
        if (mat.length*mat[0].length == r*c){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ans[row][col]=mat[i][j];
                col++;
                    if(col==c){
                        row++;
                        col= 0;
                    }
                }
            }
            return ans;
        }
        return mat;
        
    }
}
