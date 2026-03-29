// Problem: First Matching Character From Both Ends
// Link: https://leetcode.com/contest/weekly-contest-495/problems/first-matching-character-from-both-ends/
// Time: O(n) but actually it's O(n/2)
// Space: O(1)

package string.Easy;

public class First_Matching_Character_From_Both_Ends {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        for(int i = 0;i<= n/2;i++){
            if(s.charAt(i) == s.charAt(n-i-1)) return i;
        }
        return -1;
    }
}
