package DSA;

import java.util.*;

public class bubbleSort {  
    static void bubbleSort(int[] arr,int n) {
        n = arr.length;
        int temp = 0; 
        
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                                  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }             
            }  
         }
                  
        for(int i=0; i < n; i++){  
            System.out.print(arr[i] + " ");  
        }   
  
    }  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
      
        bubbleSort(arr,n);
    }  
}  