package Prefix_Sum_Basics;

public class TotalSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int totalsum = prefix[arr.length - 1];
        System.out.println("Total Sum = " + totalsum);
    }
}
