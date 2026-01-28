package Traversal_and_Operations;

public class CountEvenElements {
    public static void main(String[] args) {

        int[] arr = {23,4,332,4,23,4,-234,23,432,-4,23,4234,2,321,-3,3,23,2,3,-3,43,34,76,7};
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]%2==0){ // for odd arr[i]%2!=0, for positive count arr[]i > 1, for negative arr[i] <= -1
                count++;
            }
        }
        System.out.print(count + " ");
    }
}
