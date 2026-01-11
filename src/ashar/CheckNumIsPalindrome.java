package ashar;

import java.util.Scanner;

public class CheckNumIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        int original = N;
        int rev = 0;
        int n = N;
        while (n>0) {
            int digit = n % 10;
            rev = rev*10 + digit;
            n = n/10;
        }
        System.out.println(original == rev);
    }
}
