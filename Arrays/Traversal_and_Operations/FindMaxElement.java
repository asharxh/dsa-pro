package Traversal_and_Operations;

public class FindMaxElement {
    public static void main(String[] args) {

        int[] arr = {3,23,66,3,4,63,4,36,6,9};
        int max = arr[0]; // index 0
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){ // for min just make it opposite arr[i] < max
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
