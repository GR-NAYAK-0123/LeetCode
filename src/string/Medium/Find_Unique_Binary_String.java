// Problem: Find Unique Binary String
// Link: https://leetcode.com/problems/find-unique-binary-string/description/
// Time: O(n)
// Space: O(1)

package string.Medium;

public class Find_Unique_Binary_String {
    //Best Approach
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<n;i++){
            char current = nums[i].charAt(i);
            if(current == '1'){
                result.append('0');
            }
            else{
                result.append('1');
            }
        }
        return result.toString();
    }
}
