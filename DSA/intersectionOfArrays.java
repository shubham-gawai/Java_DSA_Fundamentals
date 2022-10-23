package DSA;
import java.util.*;
import java.util.HashSet;
public class intersectionOfArrays{
    public static void main(String[] args) {
        int arr1[] = {9,4,98,4};
        int arr2[] = {4,9,5};
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }
     // TC : C + O(N)+O(N) = O(N)
     // SC : 
}


// or direct using two loops

/*
    for(int i = 0; i<n1; i++ ) {
        for(int j = 0; j<n2; j++) {
            if(arr1[i]==arr2[j]) {
              System.out.print(arr2[j] + " ");
            }
        }
    }
 */
