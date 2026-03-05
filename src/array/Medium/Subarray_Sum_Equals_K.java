// Problem: Subarray Sum Equals K
// Link: https://leetcode.com/problems/subarray-sum-equals-k/description/
// Time: O(n * 2)
// Space: O(1)

package array.Medium;

import java.util.HashMap;

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

    // Optimal Approach with time complexity - O(n * logn) and the space complexity - O(n)
    public int subarraySum1(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            preSum += nums[i];
            if(map.containsKey(preSum-k)){
                count += map.get(preSum-k);
            }

            if(map.containsKey(preSum)){
                map.put(preSum, map.get(preSum)+1);
            }
            else{
                map.put(preSum, 1);
            }
        }
        return count;
    }
}
