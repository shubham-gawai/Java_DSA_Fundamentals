package complexity;

public class complexityST {
	 
//Rules for computing the Time and space complexity :
		
		/*
		 *  Drop all the constants (C) :
		 *  Only take the higher degree in the Polynominal :
		 */
			
// Cases in Time and Space	
		
		/*
		 * Worst case (WC) 	 : Big Oh 		- UB
		 * Best case (BC)	 : Big Omega 	- LB
		 * Average case (AC) : Theta 		- UB + LB (Sandwiched)
		 */
		
// # TIME COMPLEXITY : Iterative code

// ----------------------------------------------------------------------------------
		// 1. CONSTANT Time Complexity O(C) , O(1) , O(10) 
		 
		// constant Time Complexity  O(C) is Independent of input size : 

// Q :
		void m1() {
			int a = 10;				// C
			int b = 6;				// C
			int c;					// C
			c = a + b;				// C
			System.out.println(c);	// C
		}
		
					// C+C+C+C+C = 5C 
					// Drop 5 because it's a constant so 
					// TC : O(C)
		
// Q :
		static void m2() {
			int a=5, b=10;			// C 
			int temp =a;			// C
				a=b;				// C
				b= temp;			// C
				
					// C+C+C+C = 4C 
					// Drop 4 because it's a constant so 
					// TC : O(C)
		}
		
		
// ----------------------------------------------------------------------------------		
	
		
		
		
		// Q :
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public static void main(String[] args) {	
		
		
	}

}
