// Problem: Minimum Number of Flips to Make the Binary String Alternating
// Link: https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/description/
// Time: O(n)
// Space: O(1)

package slidingWindow.Medium;

public class Minimum_Number_of_Flips_to_Make_the_Binary_String_Alternating {
    public int minFlips(String s) {
        int length = s.length();
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        for(int i = 0;i<2 * s.length();i++){
            if(i % 2 == 0){
                s1.append('0');
                s2.append('1');
            }
            else{
                s1.append('1');
                s2.append('0');
            }
        }
        int result = Integer.MAX_VALUE;
        int flip1 = 0;
        int flip2 = 0;

        int i = 0;
        int j = 0;

        while(j < 2*length){

            if(s.charAt(j % length) != s1.charAt(j)){
                flip1++;
            }
            if(s.charAt(j % length) != s2.charAt(j)){
                flip2++;
            }

            if(j-i+1 > length){ // For shrink the window from left

                if(s.charAt(i % length) != s1.charAt(i)){
                    flip1--;
                }
                if(s.charAt(i % length) != s2.charAt(i)){
                    flip2--;
                }
                i++;
            }

            if(j-i+1 == length){
                result = Math.min(result, flip1);
                result = Math.min(result, flip2);
            }
            j++;
        }
        return result;
    }
    // Better Approach
    public int minFlips1(String s) {
        int length = s.length();
        int result = Integer.MAX_VALUE;
        int flip1 = 0;
        int flip2 = 0;

        int i = 0;
        int j = 0;

        while(j < 2 * length){

            char expectedCharS1 = (j % 2) == 0 ? '0' : '1';
            char expectedCharS2 = (j % 2) == 0 ? '1' : '0';

            if(s.charAt(j % length) != expectedCharS1){
                flip1++;
            }
            if(s.charAt(j % length) != expectedCharS2){
                flip2++;
            }


            if(j-i+1 > length){ // For shrink the window from left
                expectedCharS1 = (i % 2) == 0 ? '0' : '1';
                expectedCharS2 = (i % 2) == 0 ? '1' : '0';

                if(s.charAt(j % length) != expectedCharS1){
                    flip1--;
                }

                if(s.charAt(j % length) != expectedCharS2){
                    flip2--;
                }

                i++;
            }

            if(j-i+1 == length){
                result = Math.min(result, flip1);
                result = Math.min(result, flip2);
            }
            j++;
        }
        return result;

    }
}
