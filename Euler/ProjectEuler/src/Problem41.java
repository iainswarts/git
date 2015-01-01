public class Problem41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long max = 0;
		for (long i = 0; i < 987654321; i++) {
			max = (HelperFunctions.isPrime(i) && HelperFunctions.isPand(i + "")) ? i
					: max;
			System.out.println(max);
		}
	}

}
