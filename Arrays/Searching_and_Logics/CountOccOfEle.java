package Searching_and_Logics;

public class CountOccOfEle {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,5,4,54,3,46,5,6,12,2,5,4};

        int target = 5;
        int count = 0;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
