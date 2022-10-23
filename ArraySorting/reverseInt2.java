package ArraySorting;
//Check for overflows if overflow happens then PRINT overflow.
		
// A negative number must be negative
public class reverseInt2 {
	public static void main(String[] args) {
		
		boolean isNegative = false;
		int res = 0;

		int num = -1999999999;
		if (num < 0) {
			isNegative = true;
			num = -1 * num;
		}
		
// approch 2 to solve the same problem : reverseInt1
		while (num > 0) {
			int RMD = num % 10;
			// Running Overflow check.
			int tmp = res * 10 + RMD;
			if (tmp / 10 != res) {
				System.out.println("OVERFLOW");
				break;
			} else
				res = tmp;
			num = num / 10;
		}

		if (isNegative == true) {
			System.out.println(res * -1);
		} else
			System.out.println(res);

	}
	
	// OP :  OVERFLOW
	//		 -999999999
	// its not printing the last digit i.e : 1
}
