package Searching_and_Logics;

public class SepOddEven {
    public static void main(String[] args) {
        int[] arr = {2,3,9,1,4,3,2,8};
        int[] result = new int[arr.length];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                result[index++] = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                result[index++] = arr[i];
            }
        }
        for(int i=0; i<result.length; i++)
            System.out.print(result[i] + " ");
    }
}

// I am printing Even first , Odd Later