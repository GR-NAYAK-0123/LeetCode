// Problem: Largest Odd Number in String
// Link: https://leetcode.com/problems/largest-odd-number-in-string/description/
// Time: O(n)
// Space: O(1)

package string.Easy;

public class Largest_Odd_Number_in_String {
    //Basic approach
    public String largestOddNumber(String num) {
        /*
           Here we are traversing from right to left and checking if there is any number which is not divisible by
           2 means odd then return from start to till that index
        */
        for(int i = num.length()-1;i>=0;i--){
            char curr = num.charAt(i);

            if((curr - '0') % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }

    // Here is the same approach but line of code is very less
    public String largestOddNumber1(String num) {
        for(int i = num.length()-1;i>=0;i--){
            if((num.charAt(i) - '0') % 2 != 0) return num.substring(0, i+1);
        }
        return "";
    }
}
