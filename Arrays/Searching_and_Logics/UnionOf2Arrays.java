package Searching_and_Logics;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5,6,6,5,4};
        int[] arr2 = {1,8,6,3,4,1,6,8,5,2};

        int[] temp = new int[arr1.length + arr2.length];
        int s = 0;

        for(int i = 0; i<arr1.length; i++){
            boolean exit = false;
            for(int j = 0; j<s; j++){
                if(temp[j] == arr1[i]){
                    exit = true;
                    break;
                }
            }
            if(!exit){
                temp[s++] = arr1[i];
            }
        }
        for(int i = 0; i<arr2.length; i++){
            boolean exit = false;
            for(int j =0; j<s; j++){
                if(temp[j] == arr2[i]){
                    exit = true;
                    break;
                }
            }
            if(!exit){
                temp[s++] = arr2[i];
            }
        }
        for (int i = 0; i<s; i++){
            System.out.print(temp[i] + " ");
        }
    }
}
/*
I used unsorted array
Merge All Unique element that present in both arrays into 1.
 */