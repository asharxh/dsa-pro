package Sorting_Fundamentals;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[100];
        for(int i=0; i<arr.length; i++){
            arr[i] = r.nextInt(100000);
        }
        System.out.println("Before: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After: ");
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
