// first line contains the array size and second one the arr elements and third one the tagregt
// find the target is equal to the difference between two elements in the array or not 

package ArraySorting;
 
import java.util.*;

public class pairDifference {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
        	
            arr[i] = sc.nextInt();
            
        }
        
        Arrays.sort(arr);	// unsorted : 5 20 3 2 5 80
        					// sorted   : 2 3 5 5 20 80 
        int target = sc.nextInt();
        
        for(int i=n-1; i>=0;i--){
                if(arr[i]-arr[i-1] == target){
                	
                    System.out.println("true");
               
                }
                else {
                	
                    System.out.println("false");
                    break;
                }  
             
            break;
        }
        sc.close();
    }
}
