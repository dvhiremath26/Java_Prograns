package IntegerPrograms;

public class fibbonacciSeries {

    public static void main(String[] args) {
        
        // int n1=0, n2=1, sum=0;
        // int numSeries = 5;

        // System.out.println(n1 + ", " + n2);

        // for(int i=1; i<numSeries; i++) {
        //     sum = n1 + n2;
        //     System.out.print(", " + sum);

        //     n1 = n2;
        //     n2 = sum;
        // }

        int num = 5;
        int[] fibboArray = new int[num];

        fibboArray[0] = 0 ;
        fibboArray[1] = 1;

        for(int i=2; i<num; i++) {
            fibboArray[i] = fibboArray[i-1] + fibboArray[i-2];
        }

        System.out.println("Fibbonacci Series are: ");
        for(int i=0; i<num; i++) {
            System.out.print(fibboArray[i] + ", ");
        }
    }
    
}
