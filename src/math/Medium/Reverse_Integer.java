// Problem: Reverse Integer
// Link: https://leetcode.com/problems/reverse-integer/description/
// Time: O(n)
// Space: O(1)

package math.Medium;

public class Reverse_Integer {
    public int reverse(int x) {
        int value = x;
        int newResult = 0;
        while(value != 0){
            int last = value % 10;
            if(newResult > Integer.MAX_VALUE /10 || newResult < Integer.MIN_VALUE/10) return 0;
            newResult = last + (newResult * 10);
            value /= 10;
        }
        return newResult;
    }
}
