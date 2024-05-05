package IntegerPrograms;

public class descendingOrder {

    public static void main(String[] args) {
        
        int[] a = {90, 60, 20, 70, 10};
        int alen = a.length;

        for(int i=0; i<alen; i++) {

            for(int j=i+1; j<alen; j++) {

                if(a[i] < a[j]) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\n Descening Order: ");
        for(int i=0; i<alen; i++) {
            System.out.print(a[i] + ", ");
        }

    }
    
}
