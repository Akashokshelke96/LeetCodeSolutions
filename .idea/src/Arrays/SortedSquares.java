package Arrays;

import java.util.Arrays;

public class SortedSquares {

    public static void main(String[] args) {
        //Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
    int[]arr2 = {1,2,4,6};
        System.out.println(sortedSquares(arr2));
    }
    //this is the SOLUTION METHOD BELOW

    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]* nums[i];

        }
        Arrays.sort(nums);

        return nums;
    }
}
