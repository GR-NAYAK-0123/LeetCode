// Problem: Sort Characters By Frequency
// Link: https://leetcode.com/problems/sort-characters-by-frequency/description/
// Time: O(n) + O(n * 128)
// Space: O(n) + O(128)

package string.Medium;

public class Sort_Characters_By_Frequency {
    //Extreme brute force approach
    public int findMaxIndex(int[] freq){
        int index = -1;
        int max = -1;
        for(int i = 0;i<freq.length;i++){
            if(freq[i] > 0 && freq[i] > max) {
                max = freq[i];
                index = i;
            }
        }
        return index;
    }
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            freq[curr]++;
        }
        StringBuilder result = new StringBuilder();
        while(result.length() != s.length()){
            int index = findMaxIndex(freq);
            char ch = (char)index;

            result.append(String.valueOf(ch).repeat(freq[index]));
            freq[index] = 0;
        }
        return result.toString();
    }
}
