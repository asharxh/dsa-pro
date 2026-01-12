package ashar;

import java.util.Scanner;

/*
My task is to:
Extract each digit of the number
Add all the digits together
Print the final sum

Examples:
N = 123 → 1 + 2 + 3 = 6
N = 405 → 4 + 0 + 5 = 9
N = 0 → 0

So, sum of all digits of N

 */

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        int sum = 0;
        int n = N;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println(sum);
    }
}

