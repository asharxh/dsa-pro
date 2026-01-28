package Traversal_and_Operations;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8};
        int n = arr.length;
        int left = 0, right = n-1;

        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.print("Reversed Array = ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


/*
Note for me:
I am Used Swaping logic here.
1. first select (left) first element of array and (right) last element of array.
2. Using loop till left index is less than right index left++ and right--.
3. Now swaping logic temp = left, left = right, right = temp.
4. last is printing reversed array.
 */