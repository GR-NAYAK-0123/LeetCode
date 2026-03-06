// Problem: Check if Binary String Has at Most One Segment of Ones
// Link: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/
// Time: O(n)
// Space: O(1)

package string.Easy;

public class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones {
    // Basic Approach
    public boolean checkOnesSegment(String s) {
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == '1' && s.charAt(i-1) != '1'){
                return false;
            }
        }
        return true;
    }
}
