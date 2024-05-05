package IntegerPrograms;

import java.util.*;

/***********Binary Search***********/

public class binarySearch {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter a key value/number to serach in the array list: ");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        
        boolean flag = false;
        int l = 0;
        int h = a.length-1 ;

        while(l<=h) {
            int m = (l+h)/2;

            if(a[m]==key) {
                System.out.println("\nElement Found!");
                flag = true;
                break;
            }
            
            if (a[m]<key) {
                l = m + 1;
            }
            
            if(a[m]>key) {
                h = m -1;
            }
        }  
        if(!flag) {
            System.out.println("\nElement Not Found.....");
        } 
    }
    
}
