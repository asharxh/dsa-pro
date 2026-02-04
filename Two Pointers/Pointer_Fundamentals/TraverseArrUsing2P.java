package Pointer_Fundamentals;

public class TraverseArrUsing2P {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int l = 0;
        int r = arr.length -1;

        while(l<=r){
            System.out.println(arr[l] + " " + arr[r]);
            l++;
            r--;
        }
    }
}
