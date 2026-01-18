package Basic;

import java.util.Scanner;

public class NumBW2GivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Num: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i<=n2; i++){
            System.out.print(i + " ");
        }
    }
}
