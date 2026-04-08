// Problem: Rotate String
// Link: https://leetcode.com/problems/rotate-string/description/
// Time: O(n)
// Space: O(n) This space is for the StringBuilder

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
    /*
        Best approach to solve this problem which takes O(n * 2) time because of this substring search
        and O(2 * size of first string) space
    */
    public boolean rotateString1(String s, String goal) {
        if(s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
