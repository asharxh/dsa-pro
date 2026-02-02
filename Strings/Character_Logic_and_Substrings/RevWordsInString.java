package Character_Logic_and_Substrings;

public class RevWordsInString {
    public static void main(String[] args) {

        String s = "Hello, How are you";

        String result = "";
        int end = s.length() - 1;

        while(end>=0){
            while (end>=0 && s.charAt(end) == ' ')
                end--;
            if(end<0)
                break;

            int start = end;
            while(start>= 0 && s.charAt(start) != ' ')
                start--;
            result+= s.substring(start+1, end+1)+ " ";
            end = start -1;
        }
        System.out.println("Reverse words = " + result.trim());
    }
}


/*
Note for me
- I defined result to store final reversed result of string, then started with last character of index of string 17.
- Outer while loop, this loop will move backward through the string, and each iteration exacts one word. also space are ignored at end
- OK, Now move backward till space found. It will identify one complete word.
- extract word and adds the word to result string.
This loop will run till 0 for each Words
 */