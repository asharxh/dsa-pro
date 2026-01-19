package Counting_and_Condition;

import java.util.Scanner;

public class CheckaDigitinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        int target = 5;
        boolean found =false;
        while(n!=0){
            int digit = n%10;
            if(digit==target){
                found = true;
                break;
            }
            n/=10;
        }
        System.out.println(found);
    }
}
