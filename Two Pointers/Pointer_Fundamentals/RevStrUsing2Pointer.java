package Pointer_Fundamentals;

public class RevStrUsing2Pointer {
    public static void main(String[] args) {
        String str = "Ashar";
        char[] s = str.toCharArray();
        int l = 0;
        int r = s.length - 1;

        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        for(int i=0; i<s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
