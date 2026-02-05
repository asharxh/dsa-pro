package Pointer_Fundamentals;

public class PalindromeString {
    public static void main(String[] args) {

        String str = "A man, a plan";
        int l = 0;
        int r = str.length() - 1;
        boolean isPalindrome = true;
        while (l<r){

            char cl = str.charAt(l);
            char cr = str.charAt(r);

            if (!Character.isLetterOrDigit(cl)){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(cr)){
                r--;
                continue;
            }
            if(Character.toLowerCase(cl) != Character.toLowerCase(cr)){
                isPalindrome =false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(isPalindrome);
    }
}
