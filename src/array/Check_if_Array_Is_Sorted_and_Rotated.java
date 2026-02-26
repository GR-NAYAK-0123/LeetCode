package array;// Problem:Check if Array Is Sorted and Rotated
// Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
// Time: O(n*2)
// Space: O(1)

public class Check_if_Array_Is_Sorted_and_Rotated {
    public boolean checkSorted(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        else if(nums.length > 1){
            int count = nums.length;
            while(count != 0){
                if(checkSorted(nums)){
                    return true;
                }
                else{
                    int last = nums[nums.length-1];
                    for(int i = nums.length-2;i>=0;i--){
                        nums[i+1] = nums[i];
                    }
                    nums[0] = last;
                }
                count--;
            }
        }
        return false;
    }
}
