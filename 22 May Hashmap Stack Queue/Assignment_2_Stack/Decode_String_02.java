import java.util.Stack;

public class Decode_String_02 {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                countStack.push(c - '0');
            }else if(c == '['){
                stringStack.push(currentString);
                currentString = "";
            }else if(c == ']'){
                int count = countStack.pop();
                StringBuilder sb = new StringBuilder(stringStack.pop());
                for(int i=0; i<count; i++){
                    sb.append(currentString);
                }
                currentString = sb.toString();
            }else{
                currentString += c;
            }
        }
        return currentString;
    }

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        String decoded1 = decodeString(s1);
        System.out.println("Decoded String 1: " + decoded1);

        String s2 = "3[a2[c]]";
        String decoded2 = decodeString(s2);
        System.out.println("Decoded String 2: " + decoded2);

        String s3 = "2[abc]3[cd]f";
        String decoded3 = decodeString(s3);
        System.out.println("Decoded String 3: " + decoded3);
    }
}
