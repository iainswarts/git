public class Problem26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2;
		String[] data = new String[1000];
		data[0] = "";
		data[1] = "";
		while (i < 1000) {
			boolean saveData = true;
			if (1000 % i == 0) {
				data[i] = "";
				i++;
			} else {
				String decimal = "";
				int numerator = 1;
				while (decimal.length() < 4000) {
					while (numerator / i <= 1) {
						numerator *= 10;
					}

					decimal = decimal.concat(numerator / i + "");
					numerator = numerator % i * 10;
					if (numerator == 0) {
						saveData = false;
						break;
					}
				}
				System.out.println(i + " " + decimal);
				if (saveData)
					data[i] = decimal;
				else
					data[i] = "";
				i++;
			}

		}

		int maxLength = 0;
		int index = 0;

		for (i = 0; i < 1000; i++) {// select string
			for (int j = 1; j < 1850; j++) {// select length of ss
				for (int k = 0; k < 50; k++) {// select starting point
					System.out.println(i + "," + j + "," + k);
					if (data[i].equals(""))
						break;
					String s = data[i];

					if (s.substring(k, k + j).equals(
							s.substring(k + j, k + j * 2))
							&& s.substring(k + j, k + j * 2).equals(
									s.substring(k + 2 * j, k + j * 3))
									) {

						if (j > maxLength) {
							maxLength = j;
							index = i;
						}
						k = 100001;
						j = 510000;

					}
				}

			}

		}
		System.out.println(index + " - " + maxLength);
	}

}
