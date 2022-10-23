package ArraySorting;
/*
 *  not a sorting code : I just added it in this package :
 *  
 *  check for overflow : if overflow happens print 0 :
 *  A negative number must be negative :
 */

public class reverseInt1 {

	public static void main(String[] args) {

		boolean isNegative = false;
		long res = 0;

		// int num = -123456789;
		int num = 2147483647;
		// int num = -123;
		// int num = -12000;

		if (num < 0) {
			isNegative = true;
			num = -1 * num;
		}

		// reversing the number :
		while (num > 0) {
			int rmd = num % 10;		// rmd : right most digit
			res = res * 10 + rmd;
			num = num / 10;

		}

		// overflow check :

		if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
			System.out.println("Overflow");
		}

		else if (isNegative == true) {
			System.out.println(-1 * res);
		}

		else {
			System.out.println(res);

		}
	}

}
