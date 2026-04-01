// Problem: Search a 2D Matrix
// Link: https://leetcode.com/problems/search-a-2d-matrix/description/
// Time: O(n * log(m))  Because we are traversing the entire row and applying binary search on columns
// Space: O(1)

package binarySearch.Medium;

public class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0;i<matrix.length;i++){
            int start = 0;
            int end = matrix[i].length - 1;

            while(start <= end){
                int mid = start + (end - start) / 2;

                if(matrix[i][mid] == target) return true;
                else if(matrix[i][mid] > target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return false;
    }
    // This approach is the best Approach which takes log(m * n) time complexity and O(1) space
    public boolean searchMatrix1(int[][] matrix, int target) {
        // Best Approach
        int n = matrix.length;
        int m = matrix[0].length;

        int start = 0;
        int end = n * m - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(matrix[mid/m][mid%m] == target) return true;
            else if(matrix[mid/m][mid%m] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}
