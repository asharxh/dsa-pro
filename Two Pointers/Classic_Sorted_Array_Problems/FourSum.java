package Classic_Sorted_Array_Problems;

import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {-5,-1,3,4,2,-3,1};

        Arrays.sort(arr);
        int n = arr.length;
        int target = 4;
        for(int i=0; i<n-3; i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            for(int j=i+1; j<n-2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                int l = i + 1;
                int r = n - 1;
                while (l < r) {
                    int sum = arr[i] + arr[j] + arr[l] + arr[r];

                    if (sum == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[l] + " " + arr[r]);
                        l++;
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
    }
}