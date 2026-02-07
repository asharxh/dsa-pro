package Variable_Size_Window;

public class SmallestSubWSGK {
    public static void main(String[] args) {
        int[] arr = {5,2,4,5,1,6,8};
        int n = arr.length;
        int k = 7;
        int left =0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;

        for(int right =0; right<n; right++){
            sum+=arr[right];

            while (sum>=k){
                minlen = Math.min(minlen, right-left+1);
                sum-=arr[left];
                left++;
            }
        }
        System.out.println(
                minlen == Integer.MAX_VALUE ? -1 : minlen
        );
    }
}
