// Problem: Count Digit Appearances
// Link: https://leetcode.com/problems/count-digit-appearances/description/
// Time: O(n * log10(n))
// Space: O(1)

package Context.Biweekly.Context_180.Medium;

public class Count_Digit_Appearances {
    // Very Naive approach
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            int curr = nums[i];
            while(curr != 0){
                if(curr % 10 == digit) count++;
                curr /= 10;
            }
        }
        return count;
    }
}
