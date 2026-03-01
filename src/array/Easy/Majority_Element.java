// Problem: Majority Element
// Link: https://leetcode.com/problems/majority-element/description/
// Time: O(n)
// Space: o(1)
package array.Easy;

import java.util.Arrays;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
            return nums[0];
        }
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count > nums.length/2){
                    return nums[i];
                }
            }
            else{
                count = 1;
            }
        }
        return 0;
    }
}
