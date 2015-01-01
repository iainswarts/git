public class Problem36 {

	public static void main(String[] args) {

		int sum = 0;
		HelperFunctions hf = new HelperFunctions();
		for (int i = 0; i < 1000000; i++) {
			
			if(hf.isPalindrome(i+"") && hf.isPalindrome(hf.decimalToBin(i)))
				sum+=i;
			
		}
		System.out.println(sum);
	}

}
