package StringManipulations;


public class removeDuplicates {

    public static void main(String[] args) {       

        String str = "aaabat";
        String result = "";
        String dup = "";

        for(int i=0; i<str.length(); i++) {
            String ch = "" + str.charAt(i);

            if(result.contains(ch)){
               dup += ch;
               continue;                
            }

            result += ch;
        }
        System.out.println("\n Duplicate characters: " + dup);
        System.out.println("\nGiven string after removing duplicate characters: " + result);


        ////////////////////////////////////////////////////////////////////////////////////////

        // Using regex concept:
        // (.) --> It indiactes character
        // \\1+ --> It says character occurance more than once
        // "" --> It replaces all with empty string for the character occurs more than once

        String input = "aaabat";
        String output = input.replaceAll("(.)\\1+", "");
        System.out.println("Output by using regex concept: " + output);

    }    
}




 // String str = "deepak";
         // LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
         // for(char c : str.toCharArray()) {
         //    charSet.add(c);
         // }

         // System.out.print("\nduplicates removed from the string \"deepak\" is : ");
         // for(char c : charSet) {
         //    System.out.print(c);
         // }

         // //////////////////////////////////////////////////////////////
