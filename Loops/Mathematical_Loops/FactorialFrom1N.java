package Mathematical_Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FactorialFrom1N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact*=i;
            System.out.println(i + "!=" + fact);
        }
    }
}
