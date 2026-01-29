package Searching_and_Logics;

public class DelElementFromPOS {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,6,5,4,56,35,3,45,34};

        int pos = 4;
        int[] newarr = new int[arr.length-1];

        for(int i = 0; i<pos; i++){
            newarr[i] = arr[i];
        }
        for(int i = pos+1; i<arr.length; i++){
            newarr[i-1] = arr[i];
        }
        for(int i=0; i<newarr.length; i++){
            System.out.print(newarr[i] + " ");
        }
    }
}
