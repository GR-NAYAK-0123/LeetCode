// Problem: Minimum Operations to Transform Array into Alternating Prime
// Link: https://leetcode.com/problems/minimum-operations-to-transform-array-into-alternating-prime/description/
// Time: O(n × k × √m)
// Space: O(1)

package Context.Biweekly.Context_180.Medium;

public class Minimum_Operations_to_Transform_Array_into_Alternating_Prime {
    // Very basic approach
    public boolean isPrime(int num){
        if(num == 1) return false;
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operation = 0;
        for(int i = 0;i<n;i++){
            if(i % 2 == 0){
                if(!isPrime(nums[i])) {
                    while(!isPrime(nums[i])){
                        nums[i]++;
                        operation++;
                    }
                }
            }
            else{
                if(isPrime(nums[i])){
                    while(isPrime(nums[i])){
                        nums[i]++;
                        operation++;
                    }
                }
            }
        }
        return operation;
    }
}
