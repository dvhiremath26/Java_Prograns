package IntegerPrograms;

public class primeNum {

    public static void main(String[] args) {
        
        int num = 29;
        int count = 0;

        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                count++;
            }
        }

        if(count==2) {
            System.out.println("The given number is a Prime number");
        }else {
            System.out.println("The given number is a Not a Prime number");
        }
    }
    
}
