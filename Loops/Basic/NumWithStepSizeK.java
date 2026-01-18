package Basic;

import java.util.Scanner;

public class NumWithStepSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int n = sc.nextInt();
        int k = 3;
        for (int i = 0; i<=n; i+=k){ //i+=k will print next 3rd num from present num.
            System.out.print(i + " ");
        }
    }
}
