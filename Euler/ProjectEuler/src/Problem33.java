public class Problem33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int numerator = 10; numerator <= 99; numerator++) {
			for (int denominator = 10; denominator <= 99; denominator++) {
				double actual = (double)numerator / denominator;
				if (actual >= 1) {
					//System.out.println("breaking:" + numerator + "/"
					//		+ denominator);

				} else {
					try {
						if ((double)((int) numerator / 10) / (denominator % 10) == actual && (numerator%10+denominator%10 != 0) &&(numerator%11+denominator%11 != 0) )
							System.out.println(numerator + "/" + denominator);
						
					} catch (Exception e) {
						//System.out.println("caught");
					}
				}

			}
		}
	}

}
