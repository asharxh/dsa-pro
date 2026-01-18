package Counting_and_Condition;

import java.util.Scanner;

public class ProductofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit: ");
        int n = sc.nextInt();
        int product = 1;
        while(n!=0){
            product *= n%10;
            n/=10;
        }
        System.out.println(product);
    }

}
