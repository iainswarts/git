public class Problem35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		HelperFunctions hf = new HelperFunctions();
		loop1: for (int i = 2; i < 1000000; i++) {
			System.out.println(i);
			String s = i + "";
			for (int j = 0; j < s.length(); j++) {
				if (hf.isPrime(Integer.parseInt(s))) {
					s = s.substring(1) + s.charAt(0);
				} else {
					continue loop1;
				}

			}
			count++;

		}
		System.out.println(count);
	}

}
