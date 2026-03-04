// Problem: Special Positions in a Binary Matrix
// Link: https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/
// Time: O(n * m) + O(n * m)
// Space: O(n) + O(m)

package array.Easy;

public class Special_Positions_in_a_Binary_Matrix {
    public int numSpecial(int[][] mat) {
        int[] row = new int[mat.length];
        int[] column = new int[mat[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    row[i]++;
                    column[j]++;
                }
            }
        }
        int count = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    if(row[i] <= 1 && column[j] <= 1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
