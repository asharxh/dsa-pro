package Star_Patterns;

public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i=n; i>=1; i--){
            for(int space =1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=2*i-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//Note for me:
/*
Look carefully at outer look statement. When we are Inverting i start from n, so if i>=1 and i--
Inner Look spacing and star printing logic are same in regular and inverted.
During Execution first 1 time outer look will run then by using outer loop condition, inner loop will run
multiple time till condition match.

 */
