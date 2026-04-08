// Problem: Rotate String
// Link: https://leetcode.com/problems/rotate-string/description/
// Time: O(n)
// Space: O(1)

package string.Easy;

public class Rotate_String {
    //Brute force approach
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        StringBuilder copy = new StringBuilder(s);
        while(n != 0){
            if(copy.toString().equals(goal)) return true;

            char first = copy.charAt(0);
            copy.deleteCharAt(0);
            copy.append(first);

            n--;
        }
        return false;
    }
}
