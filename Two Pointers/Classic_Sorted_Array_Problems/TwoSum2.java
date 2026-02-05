package Classic_Sorted_Array_Problems;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int n = arr.length;

        int target = 7;
        int l =0, r=n-1;

        while(l<r){
            int sum = arr[l] + arr[r];

            if(sum==target){
                System.out.println("Indices: " + (l+1) + ", " + (r+1));
                break;
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

/*
Note for me:
Array is already sorted . l is first pointer and r is second pointer.
(l+1) + ", " + (r+1) for this line I added one because problem expecting 1-based indexing
mean index start from 1 instead of 0. As per problem requirement
 */