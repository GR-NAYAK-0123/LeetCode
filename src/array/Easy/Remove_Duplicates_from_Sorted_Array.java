// Problem: Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Time: O(n)
// Space: O(1)

package array.Easy;

public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        int count = 1;
        int current = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != current){
                current = nums[i];
                nums[idx] = nums[i];
                idx++;
                count++;
            }
        }
        return count;
    }
}
