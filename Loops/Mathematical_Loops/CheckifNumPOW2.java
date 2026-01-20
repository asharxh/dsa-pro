package Mathematical_Loops;

import java.util.Scanner;


// Is Power of 2, means a num Repeatedly div by 2 ex - 32

public class CheckifNumPOW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        boolean isPowerOf2 = true;
        if(n<=0){
            isPowerOf2 = false;
        }
        else {
            while (n>1){
                if(n%2!=0){
                    isPowerOf2 = false;
                    break;
                }
                n/=2;
            }
        }
        System.out.println(isPowerOf2 ? "Power of 2 " : "Not Power of 2 ");
    }
}
