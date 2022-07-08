package easy;

public class MakeArrayConsecutive {
    //RETURN THE NUMBER OF ELEMENTS REQUIRED TO MAKE THE ARRAY CONSECUTIVE
    public static void main(String[] args) {
     int nums [] = {1,2,3,4,9};
        System.out.println(solution(nums));
    }
    static int solution(int[] statues) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < statues.length ; i++ ){
            if(statues[i] > max){
                max = statues[i];
            }
            if(statues[i] < min){
                min = statues[i];
            }
        }
        count = max - min;
        return ((count - statues.length) + 1);
    }
}
