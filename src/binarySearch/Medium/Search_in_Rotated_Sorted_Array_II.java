// Problem: Search in Rotated Sorted Array II
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
// Time: O(log(n))
// Space: O(1)

package binarySearch.Medium;

public class Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) return true;

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++; end--;
                continue;
            }

            //Checking for left sorted
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && nums[mid] > target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                //Checking for right sorted
                if(nums[end] >= target && target > nums[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
