package Basic;

import java.util.Scanner;

public class NumExceptMulti3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Value: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
