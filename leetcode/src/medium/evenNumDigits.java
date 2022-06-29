package medium;

public class evenNumDigits {
    //Given an array nums of integers, return how many of them contain an even number of digits.
    public static void main(String[] args) {
        System.out.println(findNumbers( new  int[] {1,2,4444,323456,5}));
    }

    static int digit(int num){
        if(num<0){
            num = num * -1;
        }
        return (int)(Math.log10(num)+1);
    }


    public  static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(digit(num)%2==0){
                count++;
            }
        }
        return count;
    }

//    static boolean hasEven(int n){
//        if(n<=9){
//            return false;
//        }
//        if(n > 9 && n<=99){
//            return true;
//        }
//        else if(n >= 100 && n<=999){
//            return false;
//        }
//        else if( n >= 1000 && n<=9999){
//            return true;
//        }
//        else if(n >= 10000 && n<=99999){
//            return false;
//        }
//        else if(n >= 100000 && n<=999999){
//            return true;
//        }
//        return false;
//    }
}

