package IntegerPrograms;

public class ascendingOrder {

    public static void main(String[] args) {
        
        int[] a = {30, 10, 50, 90, 60};
        int alen = a.length;

        for(int i=0; i<alen; i++) {

            for(int j=i+1; j<alen; j++) {

                if(a[i] > a[j]) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\nAscending Order: ");
        for(int i=0; i<alen; i++) {
            System.out.print(a[i] + ", ");
        }
       
    }
    
}
