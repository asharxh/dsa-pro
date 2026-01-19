package Counting_and_Condition;

import java.util.Scanner;

public class CheckFrequencyofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        int target = 3;
        int freqcount = 0;

        while (n!=0){
            int digit = n%10;
            if (digit == target){
                freqcount++;
            }
            n/=10;
        }
        System.out.println(freqcount);
    }
}
