package Prefix_Sum_Basics;

public class SumOfRange {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i =1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        int l = 1;
        int r =3;
        int rangesum;
        if(l==0){
            rangesum = prefix[r];
        }
        else {
            rangesum = prefix[r] - prefix[l-1];
        }
        System.out.println("Range Sum = " + rangesum);
    }
}


/*
Note for me
Without Prefix sums(Brute force)
O(R-L+1) is worst case time complexity for large N size of array. Because each query ask L R
example 1000000 x 1000000 = 10^(10) operation. it will freeze.
2500-5000 ms
So,
By using prefix sum O(n) time complexity Total O(N+Q)
example for 1000000 , it will have N + Q = 2000000.
prefix time 5-15 ms
therefore prefix sum is hundreds time faster
 */