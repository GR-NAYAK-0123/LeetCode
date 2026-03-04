// Problem: Binary Search
// Link: https://leetcode.com/problems/binary-search/description/
// Time: O(log (n))
// Space: O(1)

package binarySearch.Easy;

public class Binary_Search {
    // Iterative way
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public int find(int[] nums, int start, int end, int target){
        // Base case
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target)
            return find(nums, start, mid-1, target);
        else
            return find(nums, mid+1, end, target);
    }
    // Recursive way
    public int search1(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return find(nums, start, end, target);
    }
}
