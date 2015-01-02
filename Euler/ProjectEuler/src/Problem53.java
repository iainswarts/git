public class Problem53 {

	public static void main(String[] args) {
		System.out.println(nChooseR(23,10) + "");
		int exceeds = 0;
		loop1: for (int n = 1; n <= 100; n++) {
			for (int r = 0; r <= n / 2; r++) {
				if (nChooseR(n, r)) {
					System.out.println("breaking at " + n + " - " + r);
					exceeds += (n - 2 * r + 1);
					continue loop1;
				}
			}
		}
		System.out.println(exceeds);
	}

	public static boolean nChooseR(int n, int r) {

		// returns true if > 1 million
		long top = 1;
		int count = n;
		while (count > n - r) {
			top *= count--;
		}

		long bottom = HelperFunctions.factorial(r);
		if (top <= 0 && bottom <= 0) {
			return true;
		}

		return top / bottom >= 1000000;
	}

}
