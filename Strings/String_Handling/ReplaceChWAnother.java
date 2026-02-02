package String_Handling;

public class ReplaceChWAnother {
    public static void main(String[] args) {

        String s = "Ashar";
        char target = 'h';
        char newch = 'm';
        String result = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == target){
                result+= newch;
            }
            else {
                result+=s.charAt(i);
            }
        }
        System.out.println("String = " + result);
    }
}
