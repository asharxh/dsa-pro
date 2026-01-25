package Star_Patterns;

public class InvvertedPyramid {
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
