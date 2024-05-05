package StringManipulations;

public class numInstring {

    public static void main(String[] args) {
        
        String s = "deepak @ 123";
        char arr[] = s.toCharArray();
        int n = arr.length;
        boolean flag1, flag2, flag3 = false;
        int digitCount=0, alphaCount = 0, spaceCount=0;

        for(int i=0; i<n; i++) {
            flag1 = Character.isDigit(arr[i]);  
            if(flag1 ){
                digitCount++;
            }                  
        }

        for(int i=0; i<n; i++) {
            flag2 = Character.isAlphabetic(arr[i]);
            if(flag2){
                alphaCount++;
            }                  
        }

        for(int i=0; i<n; i++) {
            flag3 = Character.isSpaceChar(arr[i]);
            if(flag3){
                spaceCount++;
            }                  
        }

        int specialCharCount = n - (digitCount + alphaCount+ spaceCount);

        System.out.println("String contains numbers and its count is: " + digitCount);
        System.out.println("String contains alphabets and its count is: " + alphaCount);
        System.out.println("String contains spaces and its count is: " + spaceCount);
        System.out.println("String contains special character and its count is: " + specialCharCount);
    }
    
}
