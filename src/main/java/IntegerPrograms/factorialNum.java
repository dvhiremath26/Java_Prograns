package IntegerPrograms;

public class factorialNum {

    public static void main(String[] args) {
        
        int num = 5;
        int factNum = 1;
        
        for(int i=1; i<=num; i++) {
            factNum *= i;
        }

        System.out.println("The factorial of a given number is: " + factNum);
    }
    
}
