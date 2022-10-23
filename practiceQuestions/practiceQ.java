
public class practiceQ {

	public static int countOdds(int low, int high) {

		int c = (high - low) / 2;
		if (low % 2 == 0 && high % 2 == 0) {
			return c;
		}
		return c + 1;

	}

	public static void main(String args[]) {
		System.out.println(countOdds(2, 7));
	}
}
