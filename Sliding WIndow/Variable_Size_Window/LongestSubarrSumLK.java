package Variable_Size_Window;

public class LongestSubarrSumLK {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,2,4,1,6};
        int n = arr.length;

        int k = 7;

        int left = 0, sum =0, maxlen=0;

        for(int right=0; right<n; right++){
            sum+=arr[right];

            while (sum>k){
                sum-=arr[left];
                left++;
            }
            maxlen = Math.max(maxlen, right-left+1);
        }
        System.out.println(maxlen);
    }
}

/*
Note for me.
This solution work only on non-negative elements.
 */
