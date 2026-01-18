package Basic;

import java.util.Scanner;

public class FirstNNatualSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N Value");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.print("Sum = " + sum);
    }
}

//first it will print first N natural Num then its sum
