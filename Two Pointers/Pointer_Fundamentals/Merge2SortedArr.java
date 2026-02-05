package Pointer_Fundamentals;

import java.util.Arrays;

public class Merge2SortedArr {
    public static void main(String[] args) {
        int[] arr1 = {5,8,1,2,3,4};
        int[] arr2 = {7,9,1,6,8,9};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] merged = new int[arr1.length + arr2.length];
        int i =0, j=0, k=0;

        while (i<arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]){
                merged[k++] = arr1[i++];
            }
            else {
                merged[k++] = arr2[j++];
            }
        }
        while (i<arr1.length) merged[k++] = arr1[i++];
        while (j<arr2.length) merged[k++] = arr2[j++];

        System.out.println("Merged Array = " + Arrays.toString(merged));
    }
}


/*
Note : Both array must be sorted before applying this logic
Used 2 pointer technique to merge
 */