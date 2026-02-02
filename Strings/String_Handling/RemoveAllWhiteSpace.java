package String_Handling;

public class RemoveAllWhiteSpace {
    public static void main(String[] args) {

        String s = "Hello, I'm Ashar";
        String result = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
}


/*
I created a temp empty string, then loop through og string.
after this i applied if condition to check if s != whitespace then new string will be incremented.
whitespace will gonna be skipped then at last i printed new string result.
 */