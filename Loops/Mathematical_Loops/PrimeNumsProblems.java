package Mathematical_Loops;

import java.util.Scanner;

public class PrimeNumsProblems {
    public static void main(String[] args) {
        countprimeinrange();
    }
    static void checkprime(){
        int n = 66;
        boolean isPrime = true;

        if (n<=1){
            isPrime = false;
        }
        else {
            for(int i = 2; i<=n/2; i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime? "Prime" : "Not Prime");
    }

    static void printallprimetoN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N");
        int n = sc.nextInt();

        for (int num = 2; num<=n; num++){
            boolean isPrime = true;

            for(int i=2; i<=n/2; i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(num + " "); // for sum of all prime sum+=num; then print sum
            }
        }
    }

    static void countprimeinrange(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int num;
        int primecount=0;
        for (num = start; num<=end; num++) {
            if(start<=1) continue;
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " ");
                primecount++;
            }
        }
        System.out.println("Prime Count = " + primecount);
    }
}