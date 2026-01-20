package Mathematical_Loops;

public class FindGCDof2Num {
    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 18;

        while (n2!=0){
            int reminder = n2;
            n2 = n1%n2;
            n1 = reminder;
        }
        System.out.println("GCD = " +n1);
    }
}

//Euclidean Algorithm(logic used) - GCD(a,b) = GCD(b, a%b), repeat until b becomes 0. When b ==0 a contain the GCD