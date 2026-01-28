package Traversal_and_Operations;

public class ReplaceAllNegW0 {
    public static void main(String[] args) {

        int[] arr = {-2,4,-3,5,6,-9,-1};
        int neg = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 0){ arr[i] = neg;}
            System.out.print(arr[i] + " ");
        }
    }
}
