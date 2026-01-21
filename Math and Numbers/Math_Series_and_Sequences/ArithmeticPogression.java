package Math_Series_and_Sequences;

import java.util.Scanner;

public class ArithmeticPogression {
    public static void main(String[] args) {
        int a = 2;
        int d = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N Value");
        int n = 10;
        int term = a;
        for(int i = 1; i<=n; i++){
            term+=d;
            System.out.print(" " + term);
        }
    }
}
