// Problem: Koko Eating Bananas
// Link: https://leetcode.com/problems/koko-eating-bananas/description/
// Time: O(log(Maximum Value of the Array)) * O(n)
// Space: O(1)

package binarySearch.Medium;

public class Koko_Eating_Bananas {
    public int findMaxValue(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++){
            if(piles[i] > max) max = piles[i];
        }
        return max;
    }
    public long calculateHour(int[] piles, int k){
        long totalTime = 0;
        for(int i = 0;i<piles.length;i++){
            totalTime += (piles[i] + (k-1)) / k;
        }
        return totalTime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int start = 1;
        int end = findMaxValue(piles);

        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;

            long count = calculateHour(piles, mid);
            if(count <= h){
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
