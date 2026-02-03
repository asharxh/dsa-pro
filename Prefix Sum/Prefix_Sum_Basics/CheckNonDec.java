package Prefix_Sum_Basics;

public class CheckNonDec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-1};

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=1; i<arr.length; i++){
            System.out.println(prefix[i]);
        }
        boolean nonDecreasing = true;
        for(int i =1; i<arr.length; i++){
            if(prefix[i] < prefix[i-1]){
                nonDecreasing = false;
                break;
            }
        }
        System.out.println(nonDecreasing);
    }
}

/*
Note for me :
prefix sums are non-decreasing always only if all elements are non-negative >=0, if array is negative then prefix
can decrease.
 */