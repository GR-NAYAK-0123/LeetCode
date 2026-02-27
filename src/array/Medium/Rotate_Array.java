// Problem: Rotate Array
// Link: https://leetcode.com/problems/rotate-array/description/
// Time: O(rotation) + O(length - rotation) + O(rotation)
// Space: O(rotation)
package array.Medium;

public class Rotate_Array {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int rotation = k % nums.length;
        int temp[] = new int[rotation];
        for(int i = length-rotation;i<length;i++){
            temp[i-(length-rotation)] = nums[i];
        }
        for(int i = length-rotation-1;i>=0;i--){
            nums[i+rotation] = nums[i];
        }
        for(int i = 0;i<rotation;i++){
            nums[i] = temp[i];
        }
    }
}
