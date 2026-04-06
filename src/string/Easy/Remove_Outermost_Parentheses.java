// Problem: Remove Outermost Parentheses
// Link: https://leetcode.com/problems/remove-outermost-parentheses/description/
// Time: O(n)
// Space: O(1)

package string.Easy;

public class Remove_Outermost_Parentheses {
    // Brute force Approach
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);

            if(curr == '(') count++;

            if(count >= 2){
                result.append(curr);
            }

            if (curr == ')') count--;
        }
        return result.toString();
    }
}
