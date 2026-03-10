// Problem: Minimum Capacity Box
// Link: https://leetcode.com/problems/minimum-capacity-box/description/
// Time: O(n)
// Space: O(1)

package array.Easy;

public class Minimum_Capacity_Box {
    // Basic approach for solving this problem with time complexity - O(n)
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int smallestIndex = -1;
        int minimum = Integer.MAX_VALUE;
        for(int i = n-1;i>=0;i--){
            if(capacity[i] >= itemSize){
                if(capacity[i] <= minimum){
                    minimum = capacity[i];
                    smallestIndex = i;
                }
            }
        }
        return smallestIndex;
    }
}
