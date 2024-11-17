package Specials;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        if (x <= 0)
            return false;
        int org = x;
        int reversed = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }

        return org == reversed;
    }
}
