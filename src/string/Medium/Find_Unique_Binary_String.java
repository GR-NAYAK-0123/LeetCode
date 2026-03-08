// Problem: Find Unique Binary String
// Link: https://leetcode.com/problems/find-unique-binary-string/description/
// Time: O(n)
// Space: O(1)

package string.Medium;

import java.util.HashSet;

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
    // Normal Approach
    public String findDifferentBinaryString1(String[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(String binary : nums){
            Integer decimal = Integer.parseInt(binary, 2);
            set.add(decimal);
        }
        for(int i = 0;i<=n;i++){
            if(!set.contains(i)){
                String binary = String.format("%16s", Integer.toBinaryString(i)).replace(' ', '0');
                return binary.substring(16-n);
            }
        }
        return "";
    }
}
