// Problem: Find Kth Bit in Nth Binary String
// Link: https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/
// Time:
// Space: O(1)
package string.Medium;

public class Find_Kth_Bit_in_Nth_Binary_String {
    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public String invert(String s){
        StringBuilder result = new StringBuilder("");
        for(int i = 0;i<s.length();i++){
            result.append(s.charAt(i) == '1' ? "0" : "1");
        }
        return result.toString();
    }
    public char findKthBit(int n, int k) {
        String store[] = new String[n];
        store[0] = "0";
        for(int i = 1;i<n;i++){
            String s1 = store[i-1] + "1" + reverse(invert(store[i-1]));
            store[i] = s1;
        }
        return store[n-1].charAt(k-1);
    }
}
