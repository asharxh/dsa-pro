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
                count++;
                System.out.println(i); //first i printed all divisor in row then count
                sum += i;
            }
        }
        System.out.println("Sum = "+ sum);
        System.out.println("count = " + count);
    }
}
