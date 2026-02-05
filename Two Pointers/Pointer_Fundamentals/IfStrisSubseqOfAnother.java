package Pointer_Fundamentals;

public class IfStrisSubseqOfAnother {
    public static void main(String[] args) {

        String s1 = "ace";
        String s2 = "abcde";

        int i =0, j=0;
        while (i< s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.println(i== s1.length());
    }
}
