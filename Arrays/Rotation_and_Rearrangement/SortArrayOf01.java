package Rotation_and_Rearrangement;

public class SortArrayOf01 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,1,0,1,1,0,1,0,1,0,1,0};

        int count0 = 0, count1 = 0;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            else {
                count1++;
            }
        }
        int index = 0;
        for(int i = 0; i<count0; i++){
            arr[index++] = 0;
        }
        for(int i = 0; i<count1; i++){
            arr[index++] = 1;
        }
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Simple Counting in first loop for 0 then 1.
form line 17 sorting start , So zero will come first then 1
In second loop (Here I just checked current value of count0 (8) then ++ total same number of 0 )
In third loop I did same as above for 1
last loop is for printing current array
 */