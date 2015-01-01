import java.util.ArrayList;

public class Problem32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Long> list = new ArrayList<Long>();

		for (long i = 1; i < 9876543; i++) {
			for (long j = 2; j < 9876543; j++) {
				int[] contains = { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
				long product = i * j;
				String s = i + "" + j + "" + product;
				if (s.length() > 9) {
					break;
				}

				for (int k = 0; k < s.length(); k++) {
					contains[Integer.parseInt(s.charAt(k) + "")] = 0;
				}

				if (sumOfArray(contains) == 0 && !list.contains(product))
					list.add(product);
				System.out.println(s);
			}
		}

		long total = 0;
		System.out.println("****************************");
		for (Long i : list) {
			System.out.println(i);
			total +=i;
		}

		System.out.println(total);
	}

	public static int sumOfArray(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;

	}

}
