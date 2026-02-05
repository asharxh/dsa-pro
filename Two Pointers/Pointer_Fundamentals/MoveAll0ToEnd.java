package Pointer_Fundamentals;

import java.util.Arrays;

public class MoveAll0ToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        int n = arr.length;
        System.out.println("Before = " + Arrays.toString(arr));
        int slow = 0;

        for (int fast = 0; fast < n; fast++) {
            if (arr[fast] != 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
        System.out.println("Array = " + Arrays.toString(arr));
    }
}
