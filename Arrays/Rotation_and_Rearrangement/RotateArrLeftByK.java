package Rotation_and_Rearrangement;

public class RotateArrLeftByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int k = 2;
        k = k%arr.length;
        int[] temp = new int[arr.length];
        int index = 0;

        for(int i=k; i<arr.length; i++){
            temp[index++] = arr[i];
        }
        for (int i = 0; i<k; i++){
            temp[index++] = arr[i];
        }
        for(int i =0; i<arr.length; i++){
            arr[i] = temp[i];
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(temp[i] + " ");
        }
    }
}
