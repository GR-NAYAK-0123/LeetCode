// Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/description/
// Time: O(log10(n))
// Space: O(1)

package math.Easy;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int value = x;
        int newValue = 0;
        while(value != 0){
            int last = value % 10;
            newValue = last + (newValue * 10);
            value /= 10;
        }
        if(newValue == x) return true;
        return false;
    }
}
