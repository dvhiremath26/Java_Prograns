package IntegerPrograms;

public class zerosLeft {

    public static void main(String[] args) {
        String str = "30207090806";
        StringBuilder output = new StringBuilder();
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '0') {
                count++;
            }
        }

        for(int i=0; i<count; i++) {
            output.append('0');
        }

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != '0') {
                output.append(str.charAt(i));
            }
        }

        System.out.println("Output: " + output.toString());

    }

    
    
}
 