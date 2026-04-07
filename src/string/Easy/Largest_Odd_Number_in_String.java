// Problem: Largest Odd Number in String
// Link: https://leetcode.com/problems/largest-odd-number-in-string/description/
// Time: O(n)
// Space: O(1)

package string.Easy;

public class Largest_Odd_Number_in_String {
    //Basic approach
    public String largestOddNumber(String num) {
        for(int i = num.length()-1;i>=0;i--){
            char curr = num.charAt(i);

            if((curr - '0') % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
