package Fixed_Size_Window;

public class CountSAKWithSGreTX {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int n = arr.length;
        int k = 3;
        int sum = 0;
        int x = 6;
        int count = 0;
        for(int i =0; i<k; i++){
            sum+=arr[i];
        }
        if(sum>x) count++;
        for(int i=k; i<n; i++){
            sum+=arr[i] - arr[i-k];
            if(sum>x) count++;
        }
        System.out.println(count);
    }
}
