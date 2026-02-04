package Subarrays_and_Fixed_Targets;

public class SortestSubarrWSK {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,2,2,5};
        int k =5;
        int minLen = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum==k){
                    minLen = Math.min(minLen, j-i+1);
                }
            }
        }
        System.out.println(
                minLen == Integer.MAX_VALUE? "Not Found" : "Shortest length = " + minLen
        );
    }
}

/*
In my array,
These are the sum solution
2+3 = 5
1+2+2 = 5
5 = 5
So, sortest length is 1
I Used Brute force approach, and this not optimized solution for this problem
Time Complexity O(n^2)
 */