package ashar;

import java.util.Scanner;

public class CountDigitInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int N = sc.nextInt();

        if (N == 0){
            System.out.println("1");
            return;
        }
        int count = 0;
        int n = N;
        while (n > 0){
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
