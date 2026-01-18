package Counting_and_Condition;

import java.util.Scanner;

public class ReverseaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int n = sc.nextInt();
        int rev = 0;
        while (n!=0){
            int digit = n%10; //Get last digit
            rev = rev * 10 + digit; //rev start with 0 then work it previous rev value to make new rev digit
            n/=10;
        }
        System.out.println(rev);
    }
}
