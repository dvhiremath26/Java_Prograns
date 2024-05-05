package IntegerPrograms;

/*  sum1 is the sum of the array
 *  sum2 is the sum of natural numbers from 1 to the length+1 of array.
 *  missing number is sum2 -sum1
 */

public class missingNum {

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5, 6, 8};
		int sum1 = 0, sum2 = 0;
		
		for(int i=0; i<a.length; i++) {
			sum1 = a[i] + sum1;
		}
		// System.out.println("Sum of all elements in array: " + sum1);
		
		for(int i=0; i<=a.length+1; i++) {
			sum2 = sum2 + i;
		}
		// System.out.println("Sum of all elements of " + sum2);
		
		int missingnum = sum2 - sum1;
		System.out.println("Missing number in array is: " + missingnum);
	}    
}
