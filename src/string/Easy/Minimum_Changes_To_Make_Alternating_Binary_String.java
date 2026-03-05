// Problem: Minimum Changes To Make Alternating Binary String
// Link: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/
// Time: O(n)
// Space: O(1)
package string.Easy;

public class Minimum_Changes_To_Make_Alternating_Binary_String {
    public int minOperations(String s) {
        int length = s.length();
        int startWith_0 = 0;
        int startWith_1 = 0;
        for(int i = 0;i<length;i++){
            if(i % 2 == 0){
                if(s.charAt(i) == '0'){
                    startWith_1++;
                }else{
                    startWith_0++;
                }
            }
            else{
                if(s.charAt(i) == '1'){
                    startWith_1++;
                }else{
                    startWith_0++;
                }
            }
        }
        return Math.min(startWith_0, startWith_1);
    }
    //Approach - 2
    public int minOperations1(String s) {
        int length = s.length();
        int startWith_0 = 0;
        for(int i = 0;i<length;i++){
            if(i % 2 == 0){
                if(s.charAt(i) == '1')
                    startWith_0++;
            }
            else{
                if(s.charAt(i) == '0')
                    startWith_0++;
            }
        }
        int startWith_1 = length - startWith_0;
        return Math.min(startWith_0, startWith_1);
    }
}
