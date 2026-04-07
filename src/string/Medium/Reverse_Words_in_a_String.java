// Problem: Reverse Words in a String
// Link: https://leetcode.com/problems/reverse-words-in-a-string/description/
// Time: O(n)
// Space: O(n)

package string.Medium;

public class Reverse_Words_in_a_String {
    //Not an efficient approach
    public String reverseWords(String s) {
        //First I need to remove if there is any leading or trailing space
        String s1 = s.trim();
        StringBuilder result = new StringBuilder();
        String temp = "";
        int count = 0;
        for(int i = s1.length() -1;i>=0;i--){
            char current = s1.charAt(i);

            if(current != ' '){
                temp = current + temp;
            }
            else{
                if(temp == "" && result.length() == 0) continue;
                else {
                    if(result.length() != 0 && temp.length() > 0){
                        result.append(' ');
                        result.append(temp);
                        temp = "";
                    }
                    else{
                        result.append(temp);
                        temp = "";
                    }
                }
            }
        }
        if(temp.length() >= 1){
            result.append(' ');
            result.append(temp);
        }
        return result.toString().trim();
    }

    //This is another approach, Without having any trim() method
    public String reverseWords1(String s) {
        StringBuilder result = new StringBuilder();
        String temp = "";
        int count = 0;
        for(int i = s.length() -1;i>=0;i--){
            char current = s.charAt(i);

            if(current != ' '){
                temp = current + temp;
            }
            else{
                if(temp == "" && result.length() == 0) continue;
                else {
                    if(result.length() != 0 && temp.length() > 0){
                        result.append(' ');
                        result.append(temp);
                        temp = "";
                    }
                    else{
                        result.append(temp);
                        temp = "";
                    }
                }
            }
        }
        if(temp.length() >= 1 && result.length() == 0){
            result.append(temp);
        }
        else if(temp.length() >= 1) {
            result.append(' ');
            result.append(temp);
        }
        return result.toString().substring(0,result.length());
    }
}
