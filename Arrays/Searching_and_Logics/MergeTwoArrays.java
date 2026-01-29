package Searching_and_Logics;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,4,5,6};
        int[] arr2 = {7,8,9,10};

        int[] merge = new int[arr1.length + arr2.length];
        int k = 0;

        for(int i = 0; i< arr1.length; i++){
            merge[k++] = arr1[i];
        }
        for (int i = 0; i<arr2.length; i++){
            merge[k++] = arr2[i];
        }
        for(int i = 0; i<merge.length; i++){
            System.out.print(merge[i] + " ");
        }
    }
}
