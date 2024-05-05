package StringManipulations;

// import java.util.HashMap;
// import java.util.Map;

public class chracterFrequency {

    public static void main(String[] args) {
        
        String str = "testing";

        char[] charArray = str.toCharArray();

        int[] freq = new int[256];

        for(char c : charArray) {
            freq[c]++;            
        }

        System.out.println("Character frequency: ");
        
        for(int i=0; i<256; i++) {
            if(freq[i] > 0) {
                System.out.println((char)i + " : " + i + " : " + freq[i]);
            }
            
        }

    }

///////////////////////////////////////////////////////////////////////////

    // public static void main(String[] args) {
    //     String str = "deepak";
    //     Map<Character, Integer> frequencyMap = new HashMap<>();

    //     // Count frequency of each character
    //     for (char ch : str.toCharArray()) {
    //         frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    //     }

    //     // Print the frequency of each character
    //     System.out.println("Character frequencies in the string '" + str + "':");
    //     for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
    //         System.out.println("'" + entry.getKey() + "': " + entry.getValue());
    //     }
    // }

    
}
