import java.util.Scanner;

public class sqaureRoot {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// temporary variable
		int temp;
		
		int sr = num / 2; // 3/2=1 //sr=1
		do {
			
			temp = sr; // temp=1
			sr = (temp + (num / temp)) / 2; // 1+(3/1)/2
		}
		
		while ((temp - sr) != 0);
		
		{
			System.out.println(sr);
		}
		
	}
}