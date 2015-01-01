public class Problem34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long total=0;
		for (int i = 3; i < 100000; i++) {
			long subtotal = 0;

			String s = i + "";
			for (int j = 0; j < s.length(); j++) {
				HelperFunctions hf = new HelperFunctions();
				subtotal+=hf.factorial(Integer.parseInt(s.charAt(j)+""));
			}
			if(subtotal == i)
				total+=i;

		}
		System.out.println(total);

	}
}
