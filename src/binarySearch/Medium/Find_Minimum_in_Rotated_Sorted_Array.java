// Problem: Find Minimum in Rotated Sorted Array
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
// Time: O(log(n))
// Space: O(1)

package binarySearch.Medium;

public class Find_Minimum_in_Rotated_Sorted_Array {
    // Basic Binary Search Approach
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] < min) min = Math.min(min, nums[mid]);

            if(nums[start] <= nums[mid]){
                min = Math.min(min, nums[start]);
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return min;
    }

    // Best Approach (Updated version of first one)
    public int findMin1(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[start] <= nums[mid]){
                min = Math.min(min, nums[start]);
                start = mid + 1;
            }
            else{
                min = Math.min(min, nums[mid]);
                end = mid - 1;
            }

        }
        return min;
    }
}
