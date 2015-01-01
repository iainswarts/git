import java.util.ArrayList;
import java.util.Iterator;

public class Problem44 {

	private static ArrayList<Integer> pentas;

	public static void main(String[] args) {

		pentas = new ArrayList<Integer>();

		int D = Integer.MAX_VALUE;

		for (int i = 1; i < 10000; i++) {
			pentas.add(i * (3 * i - 1) / 2);
		}

		for (Integer p1 : pentas) {
			for (Integer p2 : pentas) {
				// check p2>p1
				// p1 must be larger than p2
				System.out.println(p1 + " - " + p2);
				if (p2 >= p1)
					break;
				if (isPenta(p1 - p2) && isPenta(p2 + p1)) {
					D = (p1 - p2 < D) ? p1 - p2 : D;
				}
				
			}
		}
		System.out.println(D);
	}

	public static boolean isPenta(int n) {
		return pentas.contains(n);
	}

}
