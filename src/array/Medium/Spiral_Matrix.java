// Problem: Spiral Matrix
// Link: https://leetcode.com/problems/spiral-matrix/description/
// Time: O(m * n)
// Space: O(1)
package array.Medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int top = 0;
        List<Integer> result = new ArrayList<>();
        while(left <= right && top <= bottom){
            // This is from left -> right
            for(int i = left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            // This is from top -> bottom
            for(int i = top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                // This is from right -> left
                for(int i = right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(right >= left){
                // This is from bottom -> top
                for(int i = bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
