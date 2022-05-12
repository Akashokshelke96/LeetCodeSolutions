package Arrays;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        //DRIVER MAIN METHOD TO TEST THE METHOD
        int [] nums = {1,1,0,1,1,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    //this is the SOLUTION METHOD BELOW
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        // Hint: Initialise and declare a variable here to
        // keep track of how many 1's you've seen in a row.
        for (int i = 0 ; i<nums.length;i++ ){
            if(nums[i]==1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }return max;
    }
}

