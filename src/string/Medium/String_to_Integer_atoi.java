// Problem: String to Integer (atoi)
// Link: https://leetcode.com/problems/string-to-integer-atoi/description/
// Time: O(n)
// Space: O(1)

package string.Medium;

public class String_to_Integer_atoi {
    // Efficient approach to solve this problem
    public int myAtoi(String s) {
        int n = s.length();
        int result = 0;
        int sign = 1;

        int i = 0;
        while(i < n && s.charAt(i) == ' ') i++;
        if(i < n && s.charAt(i) == '+' || i < n && s.charAt(i) == '-'){
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while(i < n && s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9){
            int digit = s.charAt(i)-'0';
            if(result > (Integer.MAX_VALUE - digit) / 10){
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = digit + (result * 10);
            i++;
        }
        return (sign == 1) ? result : -result;
    }
}
