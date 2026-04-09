// Problem: Maximum Nesting Depth of the Parentheses
// Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
// Time: O(n)
// Space: O(1)

package string.Easy;

public class Maximum_Nesting_Depth_of_the_Parentheses {
    //Very basic approach, Just iterate through the string and find the maximum number of open braces
    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char current = s.charAt(i);
            if(current == '(') {
                count++;
                if(count > max) max = count;
            }
            else if(current == ')') count--;
        }
        return max;
    }
}
