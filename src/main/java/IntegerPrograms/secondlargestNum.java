package IntegerPrograms;

public class secondlargestNum {

    public static void main(String[] args) {
        
        int[] a = {10, 90, 30, 60};
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

        System.out.println("Second largest number in the array is: " + a[alen-2]);
    }
    
}
