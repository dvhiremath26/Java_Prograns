package StringManipulations;

import java.util.Arrays;

// Count the number of alphabets/numericals/special characters/spaces
public class demo {

    // input: India is great country
    // output : is great India country
    public static void main(String[] args) {

        int[] input = {1,0,0,2,3,0,4,0,0,0,5};

        int n = input.length;
        int lastIndex = n-1;

        for(int i=lastIndex; i>=0; i--) {
            if(input[i] != 0) {
                int temp = input[i];
                input[i] = input[lastIndex];
                input[lastIndex] = temp;

                lastIndex--;
            }            
        }        

        System.out.println(Arrays.toString(input));
        
        



    }    
}

