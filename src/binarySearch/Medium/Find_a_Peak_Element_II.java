// Problem: Find a Peak Element II
// Link: https://leetcode.com/problems/find-a-peak-element-ii/description/
// Time: O(n * m)
// Space: O(1)

package binarySearch.Medium;

public class Find_a_Peak_Element_II {
    // Extreme Brute force Approach
    public int[] findPeakGrid(int[][] mat) {
        //Brute force
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                int left = j-1 >= 0 ? mat[i][j-1] : -1;
                int right = j+1 < m ? mat[i][j+1] : -1;
                int top = i-1 >= 0 ? mat[i-1][j] : -1;
                int bottom = i+1 < n ? mat[i+1][j] : -1;

                if(mat[i][j]>left && mat[i][j]>right && mat[i][j]>top && mat[i][j]>bottom){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // A bit better approach but not efficient
    // Here the time complexity will be O(n * m) and space will be O(1)
    public int[] findPeakGrid1(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int max = -1;
        int row = -1;
        int col = -1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(mat[i][j] > max){
                    max = mat[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }
}
