// Problem: Rearrange Array Elements by Sign
// Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
// Time: O(n) + O(n)
// Space: o(n)

package array.Medium;

public class Rearrange_Array_Elements_by_Sign {
    //Brute force Approach
    public int[] rearrangeArray(int[] nums) {
        int result[] = new int[nums.length];
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                result[j] = nums[i];
                j+=2;
            }
        }
        j = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < 0){
                result[j] = nums[i];
                j+=2;
            }
        }
        return result;
    }
}
