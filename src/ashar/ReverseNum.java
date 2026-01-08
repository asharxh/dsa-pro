package ashar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int rev = 0;
        int n = num;
        while (n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n = n/10;
        }
        System.out.println("The reversed number is "+rev);
    }
}
