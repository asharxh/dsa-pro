package Star_Patterns;

public class CrossPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if(j==i || j==n-1-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//Note for me j == i will draw main diagonal (0,0), (1,1), (2,2), (3,3), (4,4) then j ==n-1-i will draw from
// (0,4), (1,3), (2,2), (3,1), (4,0) these position in matrix 5x5