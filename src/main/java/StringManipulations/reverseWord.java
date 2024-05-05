package StringManipulations;

public class reverseWord {

    public static void main(String[] args) {
        
        String str = "Selenium Testing Framework";
        String rev = "";
        String[] word = str.split(" ");

        for(int i=0; i<word.length; i++) {
            rev = word[i] + " " + rev;

        }
        System.out.println("Reversed string by word is: " + rev);

    }
    
}
