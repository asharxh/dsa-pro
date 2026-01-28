package Traversal_and_Operations;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {8,9,19,21,2,47,95,4,7,9,87};

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secondsmallest && arr[i] != smallest){
                    secondsmallest = arr[i];
                }
            }
        System.out.println(secondsmallest + " : Is Second Smallest");
    }
}
