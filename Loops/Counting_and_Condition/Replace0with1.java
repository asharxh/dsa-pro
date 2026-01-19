package Counting_and_Condition;

import java.util.Scanner;

public class Replace0with1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        int result = 0;
        int place = 1;
        if (n==0){
            result = 1;
        }
        while (n!=0){
            int digit = n%10;
            if (digit==0){
                digit = 1;
            }
            result+=digit*place;
            place*=10;
            n/=10;
        }
        System.out.println(result);
    }
}
