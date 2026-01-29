package Searching_and_Logics;

public class MoveAll0ToEnd {
    public static void main(String[] args) {
        int[] arr = {0,0,0,6,7,8,0,0,3,0,5,0,2,12,4,32,2,};

        int[] result = new int[arr.length];
        int index = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                result[index++] = arr[i];
            }
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i]==0){
                result[index++]=arr[i];
            }
        }
        for(int i =0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}


//I used same logic that also applied for positive negative separation, even odd separation
//To move all zero at beginning just change first if condition and make it , last if condition first
// program start executing from if(arr[i]==0){ result[index++] = arr[i];