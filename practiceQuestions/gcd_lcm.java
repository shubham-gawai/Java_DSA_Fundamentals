package practiceQuestions;
import java.util.Scanner;
public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd  = 1;

        for(int i=1; i<=num1 && i<=num2; i++){
            if(num1 % i ==0 && num2 % i ==0)
                gcd =1;
            
        }

        int lcm = (num1 * num2)/gcd;
        System.out.println(lcm);

        // check out the logic and correct the program 
        
    }
}
