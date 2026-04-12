// Problem: Find the Degree of Each Vertex
// Link: https://leetcode.com/problems/find-the-degree-of-each-vertex/description/
// Time: O(n * m)
// Space: O(1)

package Context.Weekly.Context_497.Easy;

public class Find_the_Degree_of_Each_Vertex {
    // Very basic approach
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] result = new int[n];
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                count += matrix[i][j];
            }
            result[i] = count;
        }
        return result;
    }
}
