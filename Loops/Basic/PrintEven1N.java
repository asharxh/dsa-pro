package Basic;

import java.util.Scanner;

public class PrintEven1N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            if(i%2 == 0){
                System.out.println(i +" : Is Even : ");
            }
            else {
                System.out.println(i + " : Is Not Even");
            }
        }
    }
}
