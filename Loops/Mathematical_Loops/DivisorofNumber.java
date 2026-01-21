package Mathematical_Loops;

import java.util.Scanner;

public class DivisorofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i + " "); //print all divisor in row
                count++; //this will count
                sum += i; //this will give me sum of all divisor
            }
        }
        System.out.println("Sum = "+ sum);
        System.out.println("count = " + count);
    }
}
