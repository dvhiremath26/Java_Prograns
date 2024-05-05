package IntegerPrograms;

public class gcd3num {

    public static int gcd(int a, int b) {

        while(b!=0){
            int temp = b;
            b =a%b;
            a=temp;
        }
        return a;
    }  

    public static int gcd(int x, int y, int z){
        return gcd(gcd(x, y), z);
    }
    
    public static void main(String[] args) {
        int gcd2numbers = gcd(12, 18);
        System.out.println("GCD of two numbers is: " + gcd2numbers);


        int gcd3numbers = gcd(12, 18, 48);
        System.out.println("GCD of three numbers is: " + gcd3numbers);
    }
    
}
