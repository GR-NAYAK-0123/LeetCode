// Problem: Sort Colors
// Link: https://leetcode.com/problems/sort-colors/description/
// Time: O(n)
// Space: o(1)
package array.Medium;

public class Sort_Colors {
    public void sortColors(int[] nums) {
        int zero = -1;
        int one = 0;
        int two = nums.length;
        while(one < two && one < nums.length){
            if(nums[one] == 0){
                zero++;
                int temp = nums[one];
                nums[one] = nums[zero];
                nums[zero] = temp;
                one++;
            }
            else if(nums[one] == 1){
                one++;
            }
            else if(nums[one] == 2){
                two--;
                int temp2 = nums[one];
                nums[one] = nums[two];
                nums[two] = temp2;
            }
        }
    }
}
