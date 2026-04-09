// Problem: Roman to Integer
// Link: https://leetcode.com/problems/roman-to-integer/description/
// Time: O(n)
// Space: O(7) [Just for storing the Roman Values]

package string.Easy;

import java.util.HashMap;

public class Roman_to_Integer {
    //Basic Approach to solve this problem
    public int romanToInt(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1); map.put('V', 5);
        map.put('X', 10); map.put('L', 50);
        map.put('C', 100); map.put('D', 500); map.put('M', 1000);

        int result = 0;
        for(int i = 0;i<n;i++){
            char current = s.charAt(i);
            int value = map.get(current);
            if(i+1 < n && map.get(s.charAt(i+1)) > value){
                result += map.get(s.charAt(i+1)) - value;
                i++;
            }
            else{
                result += value;
            }
        }
        return result;
    }
}
