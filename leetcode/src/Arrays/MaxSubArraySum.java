package Arrays;

public class MaxSubArraySum
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        int max = getMaxSubArraySum(arr,k);
        System.out.println(max);
    }

    public static int getMaxSubArraySum(int[] arr, int k) {
        int max = 0;
        int sum = 0;
        for(int i = 0, j = 0 ; j < arr.length ; j++){
            sum += arr[j];
            if((j - i) + 1 == k){
             max = Math.max(max,sum);
             sum -= arr[i];
             i++;
            }
        }

        return max;
    }
}
