package easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWIthCandies {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        System.out.println(kidsWithCandies(arr,2));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Initialize maximum element
        int max = candies[0];
        // Traverse array elem to find the highest number
        for (int i = 1; i < candies.length; i++)
            if (candies[i] > max)
                max = candies[i];
        //Initialize output list
        List<Boolean> output = new ArrayList<>();
        //Loop through each elem to set output[i] to true or false, depending on the sum of candies[i] and extraCandies
        for(int i =0; i<candies.length; i++){
            if(candies[i]+extraCandies<max){
                output.add(false);
            }else{
                output.add(true);
            }
        }
        //finally, return the output list
        return output;
    }
}

