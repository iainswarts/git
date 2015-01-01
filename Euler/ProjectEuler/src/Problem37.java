public class Problem37 {
	public static void main(String[] args) {

		int count = 0;
		int i = 11;
		int total = 0;
		HelperFunctions hf = new HelperFunctions();
		while (count < 11) {
			if (hf.isPrime(i) && checkSides(i)) {
				count++;
				total += i;
				System.out.println(i);
			}
			i++;

		}
		System.out.println(total);
	}

	public static boolean checkSides(int n) {
		String s = n + "";
		HelperFunctions hf = new HelperFunctions();
		for (int i = 0; i <= s.length() - 1; i++) {

			if (!hf.isPrime(Integer.parseInt(s.substring(i))))
				return false;
			if (!hf.isPrime(Integer.parseInt(s.substring(0, s.length() - i))))
				return false;

		}
		return true;

	}
}
