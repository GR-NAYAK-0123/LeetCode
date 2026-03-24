// Problem: Fibonacci Number
// Link: https://leetcode.com/problems/fibonacci-number/description/
// Time: O(2*n)
// Space: O(1)

package recursion.Easy;

public class Fibonacci_Number {
    // By using Recursion
    public int fib(int n) {
        if(n == 0 || n == 1) return n;
        return fib(n-1) + fib(n-2);
    }
}
