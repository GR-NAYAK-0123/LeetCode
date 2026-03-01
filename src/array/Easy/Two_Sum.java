// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/description/
// Time: O(n log(n)) + O(n + log(n))
// Space: o(n)
package array.Easy;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i<nums.length;i++){
            map.remove(nums[i],i);
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return new int[] {0,0};
    }
}
