package StringManipulations;

public class stringPalindrome {

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();

        int left = 0;
        int right = str.length()-1;

        while(left<right) {
            if(str.charAt(left)!=(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str = "RaceCar";

        if(isPalindrome(str)) {
            System.out.println("The given string \"RaceCar\" is a Palindrome");
        } else {
            System.out.println("The given string \"RaceCar\" is not a Palindrome");
        }
    }
}
