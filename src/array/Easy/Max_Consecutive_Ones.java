// Problem: Maximum Consecutive Ones
// Link: https://leetcode.com/problems/max-consecutive-ones/description/
// Time: O(n)
// Space: O(1)
package array.Easy;

public class Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maximumCount = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
                maximumCount = Math.max(count, maximumCount);
            }
            else{
                count = 0;
            }
        }
        return maximumCount;
    }
}
