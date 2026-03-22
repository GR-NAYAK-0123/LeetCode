// Problem: Find Peak Element
// Link: https://leetcode.com/problems/find-peak-element/description/
// Time: O(log(n))
// Space: O(1)

package binarySearch.Medium;

public class Find_Peak_Element {
    // Best Binary Search Approach
    public int findPeakElement1(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        int start = 1;
        int end = n-2;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(nums[mid] > nums[mid+1]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    // This is very Basic Approach by using Linear Search of time complexity O(n)
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        for(int i = 1;i<n-1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }
        return -1;
    }
}
