package ashar;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int i = n;
        while(i >= 1){
            System.out.println(i);
            i--;
        }
    }
}
