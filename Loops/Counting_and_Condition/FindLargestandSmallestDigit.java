package Counting_and_Condition;

import java.util.Scanner;

public class FindLargestandSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        int largest = 0; // i start with smallest digit
        int smallest = 9; //i start with largest digit
        while(n!=0){
            int digit = n%10;
            if(digit>largest){
                largest = digit;
            }
            if (digit<smallest){
                smallest = digit;
            }
            n/=10;
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
