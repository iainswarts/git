public class Problem49 {

	public static void main(String[] args) {

		for (int i = 1000; i < 9999; i++) {
			// System.out.println(i);
			for (int n = 1; n < 5000; n++) {

				int i2 = i + n;
				int i3 = i + 2 * n;

				if (HelperFunctions.isPrime(i) && HelperFunctions.isPrime(i2)
						&& HelperFunctions.isPrime(i3) && i2 < 10000
						&& i3 < 10000) {
					char c1 = (i + "").charAt(0);
					char c2 = (i + "").charAt(1);
					char c3 = (i + "").charAt(2);
					char c4 = (i + "").charAt(3);
					
					boolean flag = true;
					for (char c : (i+"").toCharArray()) {
						if(!(i2+"").contains(c+""))
							flag =false;
						if(!(i3+"").contains(c+""))
							flag =false;
					}
					
					for (char c : (i2+"").toCharArray()) {
						if(!(i+"").contains(c+""))
							flag =false;
						if(!(i3+"").contains(c+""))
							flag =false;
					}
					
					for (char c : (i3+"").toCharArray()) {
						if(!(i2+"").contains(c+""))
							flag =false;
						if(!(i+"").contains(c+""))
							flag =false;
					}
					
					if(flag)
						System.out.println(i+ " " + i2 + " " + i3);

					//if (c1 != c2 && c1 != c3 && c1 != c4 && c2 != c3
						//	&& c2 != c4 && c3 != c4) {
//						if ((i2 + "").contains(c1 + "")
//								&& (i2 + "").contains(c2 + "")
//								&& (i2 + "").contains(c3 + "")
//								&& (i2 + "").contains(c4 + "")) {
//							if ((i3 + "").contains(c1 + "")
//									&& (i3 + "").contains(c2 + "")
//									&& (i3 + "").contains(c3 + "")
//									&& (i3 + "").contains(c4 + "")) {
//								System.out.println(i + " " + i2 + " " + i3);
//							}
//						}
				//	}
				}
			}
		}

	}

	// public int[] getPerms(int n){
	//
	// char c1 = (n+"").charAt(0);
	// char c2 = (n+"").charAt(1);
	// char c3 = (n+"").charAt(2);
	// char c4 = (n+"").charAt(3);
	//
	// int[] perms = new int[12];
	//
	// perms[0] = Integer.parseInt(c1+c2+c3+c4+"");
	// perms[1] = Integer.parseInt(c1+c2+c4+c3+"");
	// perms[2] = Integer.parseInt(c1+c3+c2+c4+"");
	// perms[3] = Integer.parseInt(c1+c3+c4+c2+"");
	// perms[4] = Integer.parseInt(c1+c4+c2+c3+"");
	// perms[5] = Integer.parseInt(c1+c4+c3+c2+"");
	//
	// perms[6] = Integer.parseInt(c1+c2+c3+c4+"");
	// perms[7] = Integer.parseInt(c1+c2+c3+c4+"");
	// perms[8] = Integer.parseInt(c1+c2+c3+c4+"");
	// perms[9] = Integer.parseInt(c1+c2+c3+c4+"");
	// perms[10] = Integer.parseInt(c1+c2+c3+c4+"");
	// perms[11] = Integer.parseInt(c1+c2+c3+c4+"");
	//
	//
	// return perms;
	// }

}
