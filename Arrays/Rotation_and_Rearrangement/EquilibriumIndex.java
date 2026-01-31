package Rotation_and_Rearrangement;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,3,2,5,3,4,6};
        int n = arr.length;
        int equilibrium = -1;
        for(int i=0; i<n; i++){
            int leftsum = 0, rightsum = 0;
            for(int j = 0; j<i; j++){
                leftsum += arr[j];
            }
            for(int j =i+1; j <n; j++){
                rightsum += arr[j];
            }
            if(leftsum==rightsum){
                equilibrium=i;
                break;
            }
        }
        System.out.println("Equilibrium Index = " + equilibrium);
    }
}
