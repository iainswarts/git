public class Problem27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelperFunctions hf = new HelperFunctions();
		int nMax = 0, aMax = 0, bMax = 0;
		for (int a = -1000; a < 1000; a++) {
			for (int b = -1000; b < 1000; b++) {
				int n = 0;

				while (hf.isPrime(n * n + a * n + b)) {
					n++;
				}
				if (n > nMax) {
					nMax = n;
					aMax = a;
					bMax = b;
				}
				System.out.println(a + " " + b);
			}
		}
		
		System.out.println(aMax*bMax);
	}

}
