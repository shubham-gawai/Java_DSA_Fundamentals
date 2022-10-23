package DSA;

import java.io.*;
import java.util.*;

public class insertionSort {
 
    
    static void insertionSorting(int arr[]) {

        int i, j, key;
        
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = key;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    
         for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }
         
        insertionSorting(arr);

    }

}
