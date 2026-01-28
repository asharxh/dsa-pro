package Traversal_and_Operations;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 7, 2, 5, 8, 1, 12,91};

        int Largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] > Largest) {
                secondLargest = Largest;
                Largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != Largest){
                    secondLargest = arr[i];
                }
            }
        System.out.println(secondLargest);
    }
}