// Problem: Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/description/
// Time: O(n)
// Space: O(1)

package recursion.Easy;

public class Valid_Palindrome {
    // Very Basic Approach to solve this problem by using recursion
    public StringBuilder reverse(String s, int i){
        if(i >= s.length()) return new StringBuilder();

        char current = s.charAt(i);
        if(current >= 65 && current <= 90){
            current = (char)(current + 32);
            return reverse(s,i+1).append(current);
        }
        else if(current >= 97 && current <= 122){
            return reverse(s,i+1).append(current);
        }
        else if(current >= 48 && current <= 57){
            return reverse(s,i+1).append(current);
        }
        else{
            return reverse(s, i+1);
        }
    }
    public boolean isPalindrome(String s) {
        StringBuilder newOne = reverse(s, 0);
        String newString = newOne.toString();
        int j = 0;
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr >= 65 && curr <= 90){
                curr = (char)(curr + 32);
                if(curr != newString.charAt(j)) return false;
                else j++;
            }
            else if(curr >= 97 && curr <= 122){
                if(curr != newString.charAt(j)) return false;
                else j++;
            }
            else if(curr >= 48 && curr <= 57){
                if(curr != newString.charAt(j)) return false;
                else j++;
            }
            else continue;
        }
        return true;
    }
}
