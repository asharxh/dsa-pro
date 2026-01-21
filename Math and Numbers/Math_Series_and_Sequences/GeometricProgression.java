package Math_Series_and_Sequences;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
            int a = 2;
            int r = 3;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter N Value");
            int n = 6;
            int term = a;
            for(int i = 1; i<=n; i++){
                term*=r;
                System.out.print(" " + term);
            }
        }
    }
