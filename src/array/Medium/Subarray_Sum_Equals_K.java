// Problem: Subarray Sum Equals K
// Link: https://leetcode.com/problems/subarray-sum-equals-k/description/
// Time: O(n * 2)
// Space: O(1)

package array.Medium;

public class Subarray_Sum_Equals_K {
    // Brute force Approach
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
