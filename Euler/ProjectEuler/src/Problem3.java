public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factor = 600851475143l;
		long prime = 2l;
		while (factor != 1l) {
			if (((long)((int) (factor / prime) * prime)) == (factor)) {
				factor = factor / prime;
				System.out.println(prime);
			} else {
				prime++;
			}
		}
		System.out.println(prime);

	}

}
