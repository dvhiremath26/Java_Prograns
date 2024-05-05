package StringManipulations;

public class reverseString {
    public static void main(String[] args) {
       String str = "HELLO";
       String rev = "";
       char ch;

       for(int i=0; i<str.length(); i++) {
        ch = str.charAt(i);
        rev = ch + rev;
       }
       System.out.println("\nReversed String of \"HELLO\" is " + 
       rev);
       
    }
}

