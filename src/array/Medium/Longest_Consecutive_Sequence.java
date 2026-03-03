// Problem: Longest Consecutive Sequence
// Link: https://leetcode.com/problems/longest-consecutive-sequence/description/
// Time: O(n log(n)) + O(n)
// Space: O(1)
package array.Medium;

import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    // Normal Approach
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLength = 1;
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                count++;
                maxLength = Math.max(maxLength, count);
            }
            else if(nums[i] == nums[i-1]){
                continue;
            }
            else {
                count = 1;
            }
        }
        return maxLength;
    }
}
