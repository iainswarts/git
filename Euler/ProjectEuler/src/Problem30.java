
public class Problem30 {

	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i = 2;i<59049*5;i++)
		{
			int subTotal = 0;
			String s = i + "";
			
			for (int j	= 0; j < s.length(); j++) {
				subTotal += Math.pow(Integer.parseInt(s.charAt(j) + ""),5);
			}
			if(i == subTotal)
				total+=i;
			System.out.println(i + " " + (double)i/(59049*5));
			
			
		}
		System.out.println(total);

	}

}
