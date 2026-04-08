// Problem: Isomorphic Strings
// Link: https://leetcode.com/problems/isomorphic-strings/description/
// Time: O(n)
// Space: O(n)

package string.Easy;

import java.util.HashMap;

public class Isomorphic_Strings {
    //Brute force approach
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                if(map.get(curr) != t.charAt(i)) return false;
            }
            else{
                if(map.containsValue(t.charAt(i))) return false;
                else map.put(curr, t.charAt(i));
            }
        }
        return true;
    }
}
