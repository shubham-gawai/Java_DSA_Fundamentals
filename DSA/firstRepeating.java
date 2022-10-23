package DSA;
import java.util.*;

public class firstRepeating{

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};         // ex OP:5
        
        int n = arr.length;
        boolean found = false;
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n-1; j++){
                if(arr[i]==arr[j]){
                    found =true;
                    break;
                }
            }
              if(found==true){
                System.out.println(arr[i]);
                break;
              }
        }  
    }
}

