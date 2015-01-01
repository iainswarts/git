public class Problem6 {

	public static void main(String[] args) {
		long sum = 0l;
		long squared = 0l;

		for (int i = 0; i <= 100; i++) {
			sum += i;
			squared += (i * i);
		}
		sum = (long) sum * sum;
		System.out.println((long) sum - squared);

	}

}
