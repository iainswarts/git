public class Problem9 {
	public static void main(String[] args) {
		for (int a = 0; a < 1000; a++) {
			for (int b = 0; b < 1000; b++) {
				int c = (int) Math.sqrt(a * a + b * b);
				if (c * c == a * a + b * b) {
					if (a + b + c == 1000){
						System.out.println((long)a * b * c);
						System.out.println(a + " " + b + " " + c);
					}
				}

			}
		}
	}
}
