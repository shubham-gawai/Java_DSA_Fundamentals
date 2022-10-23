package DSA;
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch { 
    public static int binarySearchAlgo(int []arr,int target){
        int start=0, end =arr.length-1, res =-1;                         // if not found then print -1 :
    
        while(start <= end){
           int mid = start+(end-start)/2;
            
           if(arr[mid]==target){
                res =mid;
                end =mid-1;             // if elements are repeating then for last occurance :  start = mid + 1; 
           }
           else if(target > arr[mid]){
                start = mid + 1;
           }
           else{
                end =mid-1;
           }

        }
    return res;
    }

     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arr[] = {2,3,8,16,17,20,21};
            int target = sc.nextInt();
            System.out.println(binarySearchAlgo(arr,target));
                
    }
}
        // directly we can use an inbuilt method also
        // int result = Arrays.binarySearch(arr,1,6,16);
        // System.out.println(result);
        
