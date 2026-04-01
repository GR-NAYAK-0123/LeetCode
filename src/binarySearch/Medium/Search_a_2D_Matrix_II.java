// Problem: Search a 2D Matrix II
// Link: https://leetcode.com/problems/search-a-2d-matrix-ii/description/
// Time: O(n * m) Because we are traversing entire matrix
// Space: O(1)

package binarySearch.Medium;

public class Search_a_2D_Matrix_II {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Extreme Brute force Approach for this problem is linear search
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}
