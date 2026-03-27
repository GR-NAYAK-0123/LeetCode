// Problem: Minimum Number of Days to Make m Bouquets
// Link: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
// Time: O(n) + O(log(Maximum value of that array)) * O(n)
// Space: O(1)

package binarySearch.Medium;

public class Minimum_Number_of_Days_to_Make_m_Bouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long value = (long)m * k;
        if(value > n) return -1;

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(bloomDay[i] > end) end = bloomDay[i];
            if(bloomDay[i] < start) start = bloomDay[i];
        }

        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;

            int bouquets = 0;
            int count = 0;
            for(int i = 0;i<n;i++){
                if(bloomDay[i] <= mid){
                    count++;
                }
                else{
                    bouquets += count / k;
                    count = 0;
                }
            }
            bouquets += count / k;

            if(bouquets >= m){
                ans = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return ans;
    }
}
