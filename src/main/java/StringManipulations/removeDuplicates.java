package StringManipulations;


public class removeDuplicates {

    public static void main(String[] args) {       

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
        String str = "hello world";
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
        System.out.println("\nRemoved duplicates: " + result);
         // //////////////////////////////////////////////////////////////
    }
    
}
