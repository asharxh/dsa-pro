package Mathematical_Loops;

import java.util.Scanner;

public class FibonacciUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = sc.nextInt();
        int a=0, b=1;
        if(n==0) {
            System.out.println(0);
        }
        else{
            for (int i = 1; i <= n; i++){
                System.out.println(a + " ");
                int next = a+b;
                a=b;
                b=next;
                }
            }
        System.out.println(b);
        }
    }