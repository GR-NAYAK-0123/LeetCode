// Problem: Rotate Image
// Link: https://leetcode.com/problems/rotate-image/description/
// Time: O(n * n) + O(n * n)
// Space: O(n * n)

package array.Medium;

public class Rotate_Image {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int[][] result = new int[length][length];
        for(int i = 0;i<length;i++){
            for(int j = 0;j<length;j++){
                result[j][length-i-1] = matrix[i][j];
            }
        }
        for(int i = 0;i<length;i++){
            for(int j = 0;j<length;j++){
                matrix[i][j] = result[i][j];
            }
        }

    }
    // Optima Approach with time complexity - O(n/2 * n/2) + O(n + n/2) and constant space
    public void rotate1(int[][] matrix) {
        // Optimal Approach
        // Step - 1 -> Transpose the matrix
        int length = matrix.length;
        for(int i = 1;i<matrix.length;i++){
            for(int j = 0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Step - 2 -> Reverse each row
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length / 2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-j-1];
                matrix[i][length-j-1] = temp;
            }
        }

    }
}
