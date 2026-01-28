package Number_Based_Patterns;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int s=1; s<=n-1; s++){
                System.out.print(" ");
            }
            int val = 1;
            for (int j = 0; j<=i; j++){
                System.out.print(val + " ");
                val = val * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
