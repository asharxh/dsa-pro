package Mathematical_Loops;

import java.util.Scanner;

public class ConvertDec2Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N");
        int n = sc.nextInt();
        String binary = "";

        if (n==0){
            binary = "0";
        }
        while (n>0){
            binary = (n%2) + binary;
            n/=2;
        }
        System.out.println("Binary = " + binary);
    }
}

// Logic behind this solution is  n Divide by 2, store reminder.