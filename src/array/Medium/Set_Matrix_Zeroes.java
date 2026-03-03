// Problem: Set Matrix Zeroes
// Link: https://leetcode.com/problems/set-matrix-zeroes/description/
// Time: O(m * n) + O(m * n)
// Space: O(m) + O(n)
package array.Medium;

public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(row[i] == 1 || column[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
