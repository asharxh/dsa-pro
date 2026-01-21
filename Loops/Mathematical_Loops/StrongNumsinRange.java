package Mathematical_Loops;

public class StrongNumsinRange {

    public static void main(String[] args) {
        int start = 1;
        int end = 10000;

        for (int num=start; num<=end; num++){
            int temp = num;
            int sum =0;
            while (temp!=0){
                int digit = temp%10;

                int fact = 1;
                for(int i=1; i<=digit; i++){
                    fact*=i;
                }
                sum+=fact;
                temp/=10;
            }
            if(sum==num){
                System.out.println(num + " ");
            }
        }
    }
}
