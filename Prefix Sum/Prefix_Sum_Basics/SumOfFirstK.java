package Prefix_Sum_Basics;

public class SumOfFirstK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        int k = 3;
        int sum = 0;
        for(int i =0; i<k; i++){
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }