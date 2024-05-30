package StringManipulations;

public class shortName {

    public static String getShortName (String str) {
        String shortName = "";
        String words[] = str.split(" ");

        for(int i=0; i<words.length-1; i++) {
            char ch = words[i].charAt(0);
            System.out.print(ch + " ");
            shortName += ch;
        }        
        System.out.print(words[words.length-1]);
        return shortName += words[words.length-1];     
    }

    public static void main(String[] args) {
        getShortName("Selenium Testing Framework");

    }
    
}
 