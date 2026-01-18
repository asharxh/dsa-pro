package Counting_and_Condition;

import java.util.Scanner;

public class IfNumIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int n = sc.nextInt();
        int rev = 0;
        int og = n;
        while (n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }
        if(og==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}


//LeeCode 9 Palindrome Also Check Negative