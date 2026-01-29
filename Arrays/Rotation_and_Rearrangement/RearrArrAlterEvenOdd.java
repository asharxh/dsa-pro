package Rotation_and_Rearrangement;

public class RearrArrAlterEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;

        int[] even = new int[n];
        int[] odd = new int[n];
        int e = 0, o=0;

        for(int i =0; i<n; i++){
            if(arr[i]%2==0){
                even[e++] = arr[i];
            }
            else {
                odd[o++] = arr[i];
            }
        }
        int i =0, ei = 0, oi=0;

        while (ei<e&&oi<o){
            arr[i++] = even[ei++];
            arr[i++] = odd[oi++];
        }
        while (ei<e){
            arr[i++] = even[ei++];
        }
        while (oi<o){
            arr[i++] = odd[oi++];
        }
        for(int j =0; j<n; j++){
            System.out.print(arr[j] + " ");
        }
    }
}

/*
for positive and Negative alternate arrangement, just then if conditional statement. if(arr[i] >= 0) for positive
and else statement after that for negative
 */