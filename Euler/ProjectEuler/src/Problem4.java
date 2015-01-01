public class Problem4 {

	public static void main(String[] args) {

		int max = 0;
		for(int i = 0; i < 999; i++) {
			for (int j = 0; j < 999; j++) {
				char[] temp = (i*j + "").toCharArray();
				for (int k = 0; k < temp.length; k++) {
					
					if(temp[k] != temp[temp.length - 1 - k])
						break;
					else if (k == temp.length-1 && i*j > max)
						max = i*j;
				}
				
				
				
			}
		}
		System.out.println(max);
	}

}
