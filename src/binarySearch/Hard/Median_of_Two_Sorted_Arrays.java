// Problem: Median of Two Sorted Arrays
// Link: https://leetcode.com/problems/median-of-two-sorted-arrays/description/
// Time: O(nums1 + nums2)
// Space: O(nums1 + nums2)

package binarySearch.Hard;

public class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m){
            if(nums1[i] <= nums2[j]) result[k++] = nums1[i++];
            else result[k++] = nums2[j++];
        }
        while(i < n){
            result[k++] = nums1[i++];
        }
        while(j < m){
            result[k++] = nums2[j++];
        }
        if(result.length % 2 != 0) return (double)result[result.length / 2];
        return (double)(result[result.length / 2] + result[(result.length / 2) - 1]) / 2;
    }
}
