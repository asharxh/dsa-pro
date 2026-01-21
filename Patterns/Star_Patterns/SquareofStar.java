package Star_Patterns;

public class SquareofStar {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i<=n; i++){
            for(int j = 0; j<=n; j++){
                System.out.print("*"); //row x columns
            }
            System.out.println();
        }
    }
}