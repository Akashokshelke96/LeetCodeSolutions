package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        //https://leetcode.com/problems/two-sum/description/
        public static void main(String[] args) {
            int[] arr = {2,7,11,15};
            int target = 9;
            int[] ans = twoSum(arr,target);
            System.out.println(Arrays.toString(ans));
        }
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            int curr;
            int x;
            for(int i = 0 ; i < nums.length ; i++){
                curr = nums[i];
                x = target - curr;
                if(map.containsKey(x)){
                    return new int[] {map.get(x),i};
                }
                map.put(curr,i);
            }
            return null;
        }
}
