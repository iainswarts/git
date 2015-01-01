

public class Problem10 {

	public static void main(String[] args) {
		HelperFunctions h = new HelperFunctions();

		long total = 2;
		int i = 3;
		while (i < 2000000) {
			if (h.isPrime(i))
				total += i;
			i += 2;
			System.out.println(i);
		}
		System.out.println(total);

	}

}
