package IntegerPrograms;

public class diamondPattern {

    public static void main(String[] args) {
        
        int row = 5;

        for(int i=0; i<row; i++) {

            for(int j=0; j<row-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++) {
                System.out.print("*");
            } 
            System.out.println();
        }

        for(int i=row-2; i>=0; i--) {

            for(int j=0; j<row-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++) {
                System.out.print("*");
            } 
            System.out.println();
        }

    }
    
}
