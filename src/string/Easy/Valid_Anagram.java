// Problem: Valid Anagram
// Link: https://leetcode.com/problems/valid-anagram/description/
// Time: O(n) + O(n) + O(26) [This is for traversing the array]
// Space: O(26) For the frequency array

package string.Easy;

public class Valid_Anagram {
    //Brute force approach
    public boolean isAnagram(String s, String t) {
        //Brute force approach
        int[] frequency = new int[26];
        for(int i = 0;i<s.length();i++){
            frequency[s.charAt(i) - 'a']++;
        }
        for(int i = 0;i<t.length();i++){
            frequency[t.charAt(i) - 'a']--;
        }
        for(int i = 0;i<frequency.length;i++){
            if(frequency[i] != 0) return false;
        }
        return true;
    }
}
