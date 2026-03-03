// Problem: Longest Consecutive Sequence
// Link: https://leetcode.com/problems/longest-consecutive-sequence/description/
// Time: O(n log(n)) + O(n)
// Space: O(1)
package array.Medium;

import java.util.Arrays;
import java.util.HashSet;

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
    // Optimal Approach by using Set with time complexity - O(n) + O(n) and space complexity - O(n)
    public int longestConsecutive1(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLength = 1;
        int count = 0;
        int start = Integer.MIN_VALUE;
        for(int value : set){
            if(!set.contains(value - 1)){
                count = 1;
                start = value;
                while(set.contains(start+1)){
                    count++;
                    start++;
                }
                maxLength = Math.max(maxLength,count);
            }
        }
        return maxLength;
    }
}
