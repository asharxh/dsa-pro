package Star_Patterns;

public class RightAlignedTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i<=n; i++){
            for (int space =1; space<=n-1; space++){
                System.out.println(" ");

            }
            for (int star =1; star<=i; star++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
