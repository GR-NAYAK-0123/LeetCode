// Problem: Capacity To Ship Packages Within D Days
// Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
// Time: O(n) + O(n * log(Sum of the element of the array - Maximum element in the array + 1))
// Space: O(1)

package binarySearch.Medium;

public class Capacity_To_Ship_Packages_Within_D_Days {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int i = 0;i<n;i++){
            end += weights[i];
            if(weights[i] > start) start = weights[i];
        }
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int count = 0;
            for(int i = 0;i<n;i++){
                sum += weights[i];
                if(sum > mid){
                    count++;
                    sum = weights[i];
                }
            }
            if(sum > 0) count++;

            if(count <= days){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
