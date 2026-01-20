package Mathematical_Loops;

import java.util.Scanner;

public class FindLCMof2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a, y =b;
        while (b!=0){
            int reminder = b;
            b = a%b;
            a = reminder;
        }
        int gcd = a;
        int lcm = (x*y)/gcd;
        System.out.println("LCM = " + lcm);
    }
}
