package Mathematical_Loops;

import java.util.Scanner;

public class CountDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++; //this will count
                System.out.print(i + " "); //print all divisor in row
                sum += i; //this will give me sum of all divisor
            }
        }
        System.out.println("Sum = "+ sum);
        System.out.println("count = " + count);
    }
}
