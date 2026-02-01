package String_Handling;

public class StringToLowercase {
    public static void main(String[] args) {

        String s = "ASCII MANIPULATION";
        String lower = "";
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>='A' && ch<='z'){
                lower+=(char)(ch+32);
            }
            else{
                lower+=ch;
            }
        }
        System.out.println(lower);
    }
}
