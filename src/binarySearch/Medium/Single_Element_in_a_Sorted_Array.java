// Problem: Single Element in a Sorted Array
// Link: https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// Time: O(log(n))
// Space: O(1)

package binarySearch.Medium;

public class Single_Element_in_a_Sorted_Array {
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
