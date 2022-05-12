package Arrays;

public class FindNumbers {
    public static void main(String[] args) {
        //Given an array nums of integers, return how many of them contain an even number of digits.
        int[] array = {12,345,2,6,7896};
        System.out.println(FindNumbers(array));
    }
    //this is the SOLUTION METHOD BELOW
    public static int FindNumbers(int[] nums) {
        int count=0;
        for(int i =0 ; i< nums.length; i++){
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }
        return count;
    }

}
