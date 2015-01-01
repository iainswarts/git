public class Problem43 {
	public static void main(String[] args) {

		long total = 0;

		for (int i = 0; i < 10; i++) {// d1
			for (int j = 0; j < 500; j++) {// d2-4
				for (int k = 0; k < 142; k++) {// d5-7
					for (int l = 0; l < 58; l++) {// d8-10
						String s = (i + "").charAt(0) + leftPad(j*2) + leftPad(k*7)
								+ leftPad(l*17);
						System.out.println(s);
						if (HelperFunctions.isPand(s)) {

							if (Integer.parseInt(s.substring(2, 5)) % 3 == 0
									&& Integer.parseInt(s.substring(3, 6)) % 5 == 0
									&& Integer.parseInt(s.substring(5, 8)) % 11 == 0
									&& Integer.parseInt(s.substring(6, 9)) % 13 == 0)
								total += Long.parseLong(s);
							//1234567890
							//0,3
						}
					}
				}
			}

		}
		System.out.println(total);

	}

	public static String leftPad(int n) {
		String s = (n <= 999) ? "0000" + n : "000";

		return s.substring(s.length() - 3);

	}
}
