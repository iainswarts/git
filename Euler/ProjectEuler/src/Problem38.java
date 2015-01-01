public class Problem38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int max = 0;
			outer:for (int i = 1; i < 98765; i++) {
			String s = "";
			System.out.println(i);
			for (int j = 2; j < 9; j++) {
				s= "";
				for (int k = 1; k<j;k++)
					s += i * k + "";
				System.out.println(i + " " + s);
				if (s.length() > 9)
					continue outer;
				if(isPand(s) && Integer.parseInt(s) > max)
				{
					max = Integer.parseInt(s);
				}
			}
			
			
		}
			System.out.println(max);

	}

	public static boolean isPand(String s) {
		int[] contained = { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		
		for(int i =0; i < s.length();i++)
		{
			contained[Integer.parseInt(s.charAt(i) + "")] = 0;
		}
		
		for(int i =0; i < contained.length;i++)
		{
			if(contained[i] !=0)
				return false;
		}
		return true;
	}

}
