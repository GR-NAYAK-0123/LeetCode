// Problem: Union of two sorted arrays
// Link: https://takeuforward.org/plus/dsa/problems/union-of-two-sorted-arrays
// Time: O(firstArray) + O(secondArray) + O(set)
// Space: O(set)
package array.Easy;

import java.util.HashSet;

public class Union_of_two_sorted_arrays {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        int result[] = new int[set.size()];
        int j = 0;
        for(Integer value : set){
            result[j] = value;
            j++;
        }
        return result;
    }
}
