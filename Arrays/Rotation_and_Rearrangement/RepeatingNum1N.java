package Rotation_and_Rearrangement;

public class RepeatingNum1N {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,5};
        int repeating = -1;

        for(int i =0; i<arr.length; i++){
            for(int j = i+ 1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    repeating = arr[i];
                    break;
                }
            }
            if(repeating!=-1){
                break;
            }
        }
        System.out.println(repeating + " ");
    }
}
