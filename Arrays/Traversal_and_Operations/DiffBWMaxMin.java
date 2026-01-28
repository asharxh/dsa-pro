package Traversal_and_Operations;

public class DiffBWMaxMin {
    public static void main(String[] args) {
        int[] arr = {8,9,3,4,5,6,};
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){ max = arr[i];}
            if(arr[i] < min){ min = arr[i];}
        }
        int diff = max - min;
        System.out.println(diff);
    }
}
