// Problem: Longest Palindromic Substring
// Link: https://leetcode.com/problems/longest-palindromic-substring/description/
// Time: O(n * 3)
// Space: O(n) [If I check the palindrome by using recursion]

package string.Medium;

public class Longest_Palindromic_Substring {
    // This is very naive approach
    public boolean checkPalindrome(String s, int i, int j){
        if(i >= j) return true;
        return s.charAt(i) == s.charAt(j) ? checkPalindrome(s, i+1, j-1) : false;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = -1;
        int start = -1;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if(checkPalindrome(s, i, j)){
                    int currentLength = (j-i) + 1;
                    if(currentLength > maxLength){
                        maxLength = currentLength;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLength);
    }
}
