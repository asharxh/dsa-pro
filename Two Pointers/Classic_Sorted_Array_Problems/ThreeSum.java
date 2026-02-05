package Classic_Sorted_Array_Problems;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-5,-1,3,4,2,-3,1};

        Arrays.sort(arr);
        int n = arr.length;
        int target = 4;
        for(int i=0; i<n-2; i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int l = i+1;
            int r = n-1;
            while (l<r){
                int sum = arr[i] + arr[l] + arr[r];

                if(sum==target){
                    System.out.println(arr[i] + " " + arr[l] + " " + arr[r]);
                    l++;
                    r--;

                    while (l<r&&arr[l] == arr[l-1])
                        l++;
                    while (l<r&&arr[r] == arr[r+1])
                        r--;
                }
                else if(sum<target){
                    l++;
                }
                else {
                    r--;
                }
            }
        }
    }
}

/*
Note for me
This is best possible solution O(n2)
I used sorting and two pointer
 */