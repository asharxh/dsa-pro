package Searching_and_Logics;

public class IndexOfLastOcc {
    public static void main(String[] args) {
        int[] arr = {11,43,54,12,5,75,2,4,12};

        int target = 4;
        int lastindex = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                lastindex = i;
            }
        }
        System.out.println(lastindex);
    }
}

/*
Print statement Outside loop will print last index when loop finish execution.

 */