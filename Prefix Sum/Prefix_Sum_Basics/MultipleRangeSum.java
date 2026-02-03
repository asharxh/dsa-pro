package Prefix_Sum_Basics;

public class MultipleRangeSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 4, 5, 4, 2};

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int[][] queries = {
                {0, 2},
                {1, 3},
                {2, 4},
                {0,7}
        };
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int sum = 1;
            if (l == 0) {
                sum = prefix[r];
            } else {
                sum = prefix[r] - prefix[l - 1];
            }
            System.out.println("Sum [" + l + "," + r + "] = " + sum );
        }
    }
}