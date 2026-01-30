package Rotation_and_Rearrangement;

public class FirstRepeatingEle {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 2, 3, 4,9};

        int fr = -1;

        for(int i=0; i<arr.length; i++){
            for (int j =i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    fr = arr[i];
                    break;
                }
            }
            if(fr!=-1){
                break;
            }
        }
        System.out.println(fr);
    }
}
