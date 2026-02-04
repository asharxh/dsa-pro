package Subarrays_and_Fixed_Targets;

public class FindAllSubarrayWSK {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,4};
        int k =5;
        for(int i =0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum==k){
                    System.out.println("Subarray : [" + i + ", " + j + "]");
                }
            }
        }
    }
}


/*
Note for me;
Subarray is contiguous
for each i index all j will match with current i value. If sum = 5 then i will print it letter.
In first iteration i = 0(4), j = =0(4), 4+2 != 5 . 4+2+3 != 5, 4+2+6+1 = 5, 4+2+6+1+4 != 5
In second iteration i = 1(2), j = 1(2), 2+4 = 5 found so print ...
In third iteration i = 2(3), j = 2(3), 3+1 != 5 ...
In Fourth Iteration i = 3(1), j = 3(1), 1+4 = 5 found so print
 */