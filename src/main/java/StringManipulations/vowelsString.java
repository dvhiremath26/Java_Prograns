package StringManipulations;

public class vowelsString {

    public static void main(String[] args) {
        
        String str = "testing";
        int vowelCount = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the String " + str + " : " + vowelCount);
    }
    
}
