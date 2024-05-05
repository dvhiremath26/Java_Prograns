package IntegerPrograms;

public class removeDuplicate {

    public static int removeDup(int a[], int n) {

        if(n==0 || n==1) {
            return n;
        }

        int j=0;

        for(int i=0; i<n-1; i++) {
            if(a[i] != a[i+1]) {
                a[j] = a[i];
                j++;
            }
        }

        a[j++] = a[n-1];
        return j;
    }

    public static void main(String[] args) {
        
        int[] a = {0,0,0,1,1,1,1,2,2,3,3,3,4};
        int n = a.length;
        int j = 0;

        j = removeDup(a, n);
        System.out.println("Array after removing duplicates:  ");
        for(int i=0; i<j; i++) {
            System.out.print(a[i] + ", ");
        }
    }
    
}
