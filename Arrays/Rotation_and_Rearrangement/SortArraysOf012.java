package Rotation_and_Rearrangement;

public class SortArraysOf012 {
    public static void main(String[] args) {

        int[] arr = {1,2,0,0,2,0,1,2,1,0,2,1,1,2,0,2,1,0,1,0,2,2,1,0};

        int count0 = 0, count1 = 0, count2 = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            if(arr[i] == 1){
                count1++;
            }
            if (arr[i] ==2) {
                count2++;
            }
        }
        int index = 0;
        for(int i=0; i<count0; i++){
            arr[index++] = 0;
        }
        for(int i=0; i<count1; i++){
            arr[index++] = 1;
        }
        for(int i=0; i<count2; i++){
            arr[index++] = 2;
        }
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }
    }
}
