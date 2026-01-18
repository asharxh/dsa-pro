package Counting_and_Condition;

import java.util.Scanner;

public class SumOfDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit");
        int d = sc.nextInt();
        int sum = 0;
        while (d!=0){
            sum +=d%10;
            d/=10;
        }
        System.out.println("Sum = " + sum);
    }
}
