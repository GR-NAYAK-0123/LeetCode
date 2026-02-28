// Problem: Single Number
// Link: https://leetcode.com/problems/single-number/description/
// Time: O(n)
// Space: O(1)
package array.Easy;

public class Single_Number {
    public int singleNumber(int[] nums) {
        //Here the optimal solution is XOR
        int XOR = 0;
        for(int i = 0;i<nums.length;i++){
            XOR ^= nums[i];
        }
        return XOR;
    }
}
