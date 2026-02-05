package Windowed_Two_Pointer;

public class LongestSubarrwithSK {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,1,1,5};

        int k = 6;
        int left = 0, sum = 0, maxLen =0;
        for(int right=0; right<arr.length; right++){
            sum +=arr[right];

            while (sum>k){
                sum -= arr[left];
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        System.out.println("Longest length = " + maxLen);
    }
}
