package String_Handling;

public class LengthOfString {
    public static void main(String[] args) {
        String s = "Ashar";
        //int length = s.length(); // this is build-in approach
        int length = 0;
        for(char c: s.toCharArray()){
            length++;
        }
        System.out.println(s);
        System.out.println(length);
    }
}
