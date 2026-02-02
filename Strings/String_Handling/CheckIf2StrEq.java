package String_Handling;

import java.util.Scanner;

public class CheckIf2StrEq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter S1 & S2");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean equal = true;
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1!=len2){
            equal = false;
        }
        else {
            for(int i =0; i<len1; i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    equal = false;
                    break;
                }
            }
        }
        System.out.println(equal? "String are Equal" : "String are not Equal");
    }
}
