package Basic;

import java.util.Scanner;

public class MultiTableofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N");
        int n = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (i*n));
        }
    }
}
