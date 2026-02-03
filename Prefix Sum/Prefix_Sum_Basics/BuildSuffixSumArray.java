package Prefix_Sum_Basics;

public class BuildSuffixSumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int[] suffix = new int[arr.length];
        suffix[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            suffix[i] = suffix[i+1] + arr[i];
        }
        for(int i=0; i<suffix.length; i++) {
            System.out.println(suffix[i]);
        }
    }
}

/*
Suffix Sum is same is prefix sum, its just print from end to start array. index 0 is last element of array
for above arr 10, 9, 7, 4 will be printed
So, base case is suffix[n-1] = arr[n-1] , mean last element right to left
common use case : right queries, splits
 */