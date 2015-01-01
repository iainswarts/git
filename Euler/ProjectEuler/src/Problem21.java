public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amicableSum = 0;
		for (int i = 1; i < 10000; i++) {
			int testing = getSumOfFactors(i);
			
			if(getSumOfFactors(testing) == i && testing !=i){
				System.out.println(i);
				amicableSum +=i;
			}
		}
		System.out.println(amicableSum);
	}

	public static int getSumOfFactors(int n) {
		HelperFunctions hf = new HelperFunctions();
		int sum = 0;
		for (int i : hf.getFactors(n)) {
			sum += i;
		}
		return sum;

	}

}
