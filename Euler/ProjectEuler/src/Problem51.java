public class Problem51 {
	public static String many = "";
	
	public static void main(String[] args) {

		char[] charArr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'x' };

		for (int d1 = 0; d1 < 11; d1++) {
			for (int d2 = 0; d2 < 11; d2++) {
				for (int d3 = 0; d3 < 11; d3++) {
					for (int d4 = 0; d4 < 11; d4++) {
						for (int d5 = 0; d5 < 11; d5++) {
							for (int d6 = 0; d6 < 11; d6++) {
								for (int d7 = 0; d7 < 11; d7++) {
									for (int d8 = 0; d8 < 11; d8++) {
										String s = "" + charArr[d1]
												+ charArr[d2] + charArr[d3]
												+ charArr[d4] + charArr[d5]
												+ charArr[d6] + charArr[d7]
												+ charArr[d8];
										getPrimePerm(s);
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(many);
	}

	public static String getPrimePerm(String s) {
		System.out.println(s);
		if(s.replaceAll("x", "0").equals("00000000") || !s.contains("x")){
			return "nothing";
		}
		
		int numPrimes = 0;
		for(int i =0;i<10;i++){
			if(HelperFunctions.isPrime(Long.parseLong(s.replaceAll("x",i+"")))){
				numPrimes++;
			}
		}
		if(numPrimes==8){
			System.out.println(s);
			System.exit(1);
		}
		
			
		
		return "" + numPrimes;
	}
}
