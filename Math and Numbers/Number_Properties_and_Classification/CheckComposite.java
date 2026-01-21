package Number_Properties_and_Classification;

public class CheckComposite {
    public static void main(String[] args) {
        int n = 29;
        boolean isComp = false;

        if(n>1){
            for(int i = 2; i<=n/2; i++){
                if(n%i==0){
                    isComp = true;
                    break;
                }
            }
        }
        System.out.println(isComp? "Composite" : "Not Composite");
    }
}

//Unlike Prime Numbers, Composite is that has more then two Divisor, I Change value of n to test multi.