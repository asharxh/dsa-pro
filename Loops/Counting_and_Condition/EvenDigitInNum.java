package Counting_and_Condition;

import java.util.Scanner;

public class EvenDigitInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        int counteven = 0;
        while (n!=0){
            int digit = n%10;
            if(digit % 2==0){ //for odd count just change if (digit%2!=0)
                counteven++;
            }
            n/=10;
        }
        System.out.println(counteven);
    }
}
