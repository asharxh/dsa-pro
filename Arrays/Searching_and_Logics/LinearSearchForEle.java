package Searching_and_Logics;

public class LinearSearchForEle {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,1,6,7,8};

        int target = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println(i);
            }
        }
    }
}
/*
        OR (I'm Using Boolean To Linear Search Check Yes/No)

        int target = 1;
        int found = false;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                found = true;
                break;
            }
            System.out.println(found?"Element Found" : "Not Found")
 */