package Counting_and_Condition;

import java.util.Scanner;

public class CountZeroDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int n = sc.nextInt();
        int countzero = 0;
        while(n!=0){
            int digit = n%10;
            if(digit==0){
                countzero++;
            }
            n/=10;
        }
        System.out.println(countzero);
    }
}
