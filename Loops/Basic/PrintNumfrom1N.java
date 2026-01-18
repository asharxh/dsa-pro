package Basic;

import java.util.Scanner;

public class PrintNumfrom1N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print(i + " ");
        }
    }
}