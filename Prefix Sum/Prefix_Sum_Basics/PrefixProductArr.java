package Prefix_Sum_Basics;

public class PrefixProductArr {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefixprod = new int[arr.length];
        prefixprod[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixprod[i] = prefixprod[i - 1] * arr[i]; // Just multiple here , simple
        }
        for(int i =0; i<arr.length; i++){
            System.out.println(prefixprod[i]);
        }
    }
}
