package Pointer_Fundamentals;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int l = 0, r=arr.length - 1;
        boolean isPalindrome = true;
        while (l<r){
            if (arr[l] != arr[r]){
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(isPalindrome);
    }
}
