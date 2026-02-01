package String_Handling;

public class CountWhitespaces {
    public static void main(String[] args) {
        String s = "Ashar Loves Problem Solving";
        int spacecount = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                spacecount++;
            }
        }
        System.out.println(spacecount);
    }
}
