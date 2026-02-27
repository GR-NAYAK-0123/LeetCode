// Problem: Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/description/
// Time: O(n) + O(n - mark)
// Space: O(1)
package array.Easy;

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int mark = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[mark] = nums[i];
                mark++;
            }
        }
        if(mark <= nums.length-1){
            for(int i = mark;i<nums.length;i++){
                nums[i] = 0;
            }
        }

    }
}
