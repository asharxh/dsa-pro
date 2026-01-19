package Counting_and_Condition;

import java.util.Scanner;

public class SumofDigitatEvenPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        int pos = 1;
        int evensum = 0;
        while (n!=0){
            int digit = n%10;
            if(pos%2==0){ // for odd sum !=0
                evensum+=digit;
            }
            pos++;
            n/=10;
        }
        System.out.println(evensum);
    }
}
