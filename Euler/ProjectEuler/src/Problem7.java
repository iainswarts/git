public class Problem7 {

	public static void main(String[] args) {
		int i = 1;
		int k = 2;
		while (i != 10002) {

			int oldk = k;
			int j = k - 1;
			while (j > 1) {
				if (k % j == 0) {
					k = k + 1;
					break;
				} else {
					j--;
				}
			}
			if (k == oldk) {
				k++;
				i++;
				oldk = k;

			} else {
				oldk = k;
			}
			System.out.println(k);
		}
		System.out.println(k - 1);

	}
}
