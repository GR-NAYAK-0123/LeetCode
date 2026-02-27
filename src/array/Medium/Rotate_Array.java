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

        // Optimal Solution
//        int rotation = k % nums.length;
//        int length = nums.length;
//        rotateArray(nums,length-rotation,length-1);
//        rotateArray(nums,0,length-rotation-1);
//        rotateArray(nums,0,length-1);
    }

//    public void rotateArray(int arr[], int start, int end){
//        int middle = (start + end) / 2;
//        for(int i = start;i<=middle;i++){
//            int firstValue = arr[i];
//            int secondValue = arr[(start+end)-i];
//            arr[i] = secondValue;
//            arr[(start+end)-i] = firstValue;
//        }
}
