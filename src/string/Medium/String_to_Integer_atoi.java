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

    // This is the another approach by using recursion
    // It takes O(n) time and O(n) recursive stack space
    public int get_result(String s, int i, int sign, int result){
        if(i == s.length()){
            return sign == -1 ? -result : result;
        }
        else if(s.charAt(i) == ' '){
            if(i-1 >= 0 && s.charAt(i-1) != ' ') return sign == -1 ? -result : result;
            return get_result(s, i+1, sign, result);
        }
        else if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            if(i-1 >= 0 && s.charAt(i-1) != ' '){
                return sign == -1 ? -result : result;
            }
            sign = s.charAt(i) == '-' ? -1 : 1;
            return get_result(s, i+1, sign, result);
        }
        else if(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9){
            if(result > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10){
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = s.charAt(i) - '0' + (result * 10);
            return get_result(s, i+1, sign, result);
        }
        else{
            return sign == -1 ? -result : result;
        }

    }
    public int myAtoi_1(String s) {
        return get_result(s, 0, 1, 0);
    }
}
