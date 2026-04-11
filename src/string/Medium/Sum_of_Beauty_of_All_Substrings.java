// Problem: Sum of Beauty of All Substrings
// Link: https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/
// Time: O(n * 3)
// Space: O(1)
     /*
         What actually happens in your code?
         Every time getBeautyValue() is called:
         int[] freq = new int[26];
         A new array is created ✅
         But after the function finishes → that array is eligible for garbage collection ❗
         It does NOT stay in memory
         Space Complexity = O(1)
         Because only one fixed-size array exists at a time.
     */

package string.Medium;

public class Sum_of_Beauty_of_All_Substrings {
    // Very naive approach
    public int getBeautyValue(String s, int i, int j){
        int[] freq = new int[26];
        while(i <= j){
            freq[s.charAt(i) - 'a']++;
            i++;
        }
        int max = freq[0];
        int min = freq[0];
        for(int k = 1;k<freq.length;k++){
            if(freq[k] > max){
                max = freq[k];
                if(min == 0) min = freq[k];
            }
            else if(freq[k] != 0 && freq[k] < min) min = freq[k];
        }
        return max - min;
    }
    public int beautySum(String s) {
        int n = s.length();
        int result = 0;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                result += getBeautyValue(s, i, j);
            }
        }
        return result;
    }
}
