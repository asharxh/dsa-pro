package Counting_and_Condition;

import java.util.Scanner;

class CheckArmstrongNum {
    public static void main(String[] args) {
        armstrongrange();
    }
        static void armstrongnum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0){
            int digit = n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        System.out.println(sum==n? "Armstrong" : "Not Armstrong");
    }

    static void armstrongrange() {
        int start = 100;
        int end = 500;
        for (int num = start; num <= end; num++) {
            int n = num;
            int sum = 0;
            while (n !=0){
                int digit = n % 10;
                sum += digit * digit * digit;
                n /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
