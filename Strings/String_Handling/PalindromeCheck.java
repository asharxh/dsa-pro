package String_Handling;

public class PalindromeCheck {
    public static void main(String[] args) {

        String s="rahar";
        String rev = "";
        boolean isPalindrome = true;
        for(int i=s.length()-1; i>=0; i--){
            rev +=s.charAt(i);
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != rev.charAt(i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}