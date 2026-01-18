package Counting_and_Condition;

import java.util.Scanner;

public class CountDigitInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit");
        int n = sc.nextInt();

        int count = 0;
        while (n!=0){
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}
