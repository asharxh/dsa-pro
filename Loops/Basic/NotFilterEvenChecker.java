package Basic;

import java.util.Scanner;

public class NotFilterEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println((2*i) + " "); //Without if Checking
        }
    }
}
