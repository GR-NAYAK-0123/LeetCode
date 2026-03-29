// Problem: Find the Smallest Divisor Given a Threshold
// Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
// Time: O(n) + O(n * log(Maximum value of the array))
// Space: O(1)

package binarySearch.Medium;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int end = Integer.MIN_VALUE;
        int start = 1;
        // This iteration only for finding the maximum element in the array
        for(int i = 0;i<n;i++){
            if(nums[i] > end) end = nums[i];
        }

        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            int result = 0;
            for(int i = 0;i<n;i++){
                result += (nums[i] + (mid - 1)) / mid;
            }

            if(result <= threshold){
                ans = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return ans;
    }
}
