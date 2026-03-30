// Problem: Kth Missing Positive Number
// Link: https://leetcode.com/problems/kth-missing-positive-number/description/
// Time: O(n) + O(Maximum element of the array + Given K)
// Space: O(n) + O(Maximum element of the array + Given K)

package binarySearch.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Kth_Missing_Positive_Number {
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
