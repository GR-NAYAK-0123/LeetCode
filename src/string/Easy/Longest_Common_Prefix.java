// Problem: Longest Common Prefix
// Link: https://leetcode.com/problems/longest-common-prefix/description/
// Time: O(n) * O(Each String)
// Space: O(1)

package string.Easy;

public class Longest_Common_Prefix {
    //Extreme brute force approach which takes a lot of time
    public String longestCommonPrefix(String[] strs) {
        //Brute force approach
        String prefix = strs[0];
        for(int i = 1;i<strs.length;i++){
            String current  = strs[i];
            String common = "";
            for(int j = 0;j<current.length();j++){
                if(j < prefix.length() && current.charAt(j) == prefix.charAt(j)){
                    common += current.charAt(j);
                }
                else break;
            }
            prefix = common;
        }
        return prefix;
    }
}
