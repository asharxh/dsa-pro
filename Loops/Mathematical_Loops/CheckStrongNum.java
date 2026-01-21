package Mathematical_Loops;

import java.util.Scanner;

public class CheckStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n!=0){
            int digit = n%10;
            int fact = 1;
            for(int i = 1; i<=digit; i++){
                fact*=i;
            }
            sum += fact;
            n/=10;
        }
        System.out.println(sum);
        System.out.println(sum == temp ? "Strong Number" : "Not Strong Number");
    }
}
