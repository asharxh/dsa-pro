package Searching_and_Logics;

public class IndexOfFirstOcc {
    public static void main(String[] args) {
        int[] arr = {11,43,54,12,5,75,2,4,12};

        int target = 12;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println(i);
                break;
            }
        }
    }
}
