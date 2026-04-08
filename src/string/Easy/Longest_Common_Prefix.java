// Problem: Longest Common Prefix
// Link: https://leetcode.com/problems/longest-common-prefix/description/
// Time: O(n) * O(Each String)
// Space: O(1)

package string.Easy;

import java.util.Arrays;

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
    //A bit better approach which took O(n * Log(n)) (for sorting) + O(n) of time and O(1) space
    public String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String common = "";
        String end = strs[strs.length - 1];
        for(int i = 0;i<end.length();i++){
            if(i < first.length() && end.charAt(i) == first.charAt(i)) common += end.charAt(i);
            else break;
        }
        return common;
    }
}
