// Problem: Single Element in a Sorted Array
// Link: https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// Time: O(log(n))
// Space: O(1)

package binarySearch.Medium;

public class Single_Element_in_a_Sorted_Array {
    public int singleNonDuplicate1(int[] nums) {
        //Best Approach
        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        int start = 1;
        int end = n-2;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];

            if((mid % 2 != 0 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    // Pure Brute force with time complexity O(n) (Basic Approach)
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]) return nums[i];
            else{
                i++;
            }
        }
        return nums[nums.length-1];
    }
}
