// Problem: Maximum Subarray
// Link: https://leetcode.com/problems/maximum-subarray/description/
// Time: O(n)
// Space: O(1)

package array.Medium;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            maxValue = Math.max(maxValue, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxValue;
    }
}
