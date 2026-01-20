package Mathematical_Loops;

import java.util.Scanner;

public class IfNumisPOWK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num Value");
        int n = sc.nextInt();
        System.out.println("Enter K Value");
        int k = sc.nextInt();
        boolean isPowerOfK = true;
        if(n<=0 || k<=1){
            isPowerOfK = false;
        }
        else {
            while (n>1){
                if(n%k!=0){
                    isPowerOfK = false;
                    break;
                }
                n/=k;
            }
        }
        System.out.println(isPowerOfK ? "Power of " + k : "Not Power of " + k);
    }
}
