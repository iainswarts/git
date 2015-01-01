import java.util.ArrayList;

public class Problem5 {

	public static void main(String[] args) {
		int total = 1;
		ArrayList<Integer> l = new ArrayList<Integer>();

		for (int i = 1; i < 20; i++) {
			int b = i;
			if (total % i == 0) {
				// total *= i;
				l.add(i);
			} else {
				for (int j : l) {
					if (b%j == 0){
						b = b/j;
					}
				}
				total *=b;
			}
			l.add(b);
			System.out.println(i);
		}
		System.out.println(total);
	}
}
