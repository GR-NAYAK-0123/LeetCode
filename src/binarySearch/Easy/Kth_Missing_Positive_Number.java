// Problem: Kth Missing Positive Number
// Link: https://leetcode.com/problems/kth-missing-positive-number/description/
// Time: O(n) + O(Maximum element of the array + Given K)
// Space: O(n) + O(Maximum element of the array + Given K)

package binarySearch.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Kth_Missing_Positive_Number {
    // The perfect Approach to solve this question which takes O(log(n)) time and O(1) space
    public int findKthPositive2(int[] arr, int k) {
        int n = arr.length;
        // Perfect One Approach
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            int missing = arr[mid] - (mid + 1);
            if(missing < k) start = mid + 1;
            else end = mid - 1;
        }
        return end + 1 + k; // return start + k;  because start = end + 1;
    }
    // This Approach is a bit better than the last one because it doesn't take any extra space
    public int findKthPositive1(int[] arr, int k) {
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] <= k) k++;
            else{
                return k;
            }
        }
        return k;
    }
    // It's very brute force approach which takes lots of time and space
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            set.add(arr[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<= (k+arr[n-1]);i++){
            if(!set.contains(i)) list.add(i);
        }
        return list.get(k-1);
    }
}
