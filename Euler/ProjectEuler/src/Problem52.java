public class Problem52 {

	public static void main(String[] args) {

		for(int i =1; i < 10000000;i++){
			String a1 = analyseInt(i);
			System.out.println(i);
			if(a1.equals(analyseInt(i*2)) && a1.equals(analyseInt(i*3)) && a1.equals(analyseInt(i*4)) && a1.equals(analyseInt(i*5)) && a1.equals(analyseInt(i*6))){
				
				System.exit(1);
			}
		}
	}

	public static String analyseInt(int n) {
		// 0 = 48
		int[] numbers = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < (n + "").length(); i++) {
			numbers[(n + "").charAt(i) - 48]++;
		}
		String s = "";

		for (int i = 0; i < 10; i++)
		{
			s += numbers[i] + "";
		}
		return s;
	}

}
