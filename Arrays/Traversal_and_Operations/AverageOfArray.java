package Traversal_and_Operations;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1,2,4,5};
        int sum = 0;
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        double avg;
        avg = (double)sum/n;
        System.out.println("Average = " +avg);
    }
}
