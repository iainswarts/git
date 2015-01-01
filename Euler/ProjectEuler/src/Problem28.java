public class Problem28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long total = 1;
		long offset = 2;
		long digitOn = 1;
		for (int i = 0; i < 500; i++) {
			digitOn += offset;
			total += digitOn;
			digitOn += offset;
			total += digitOn;
			digitOn += offset;
			total += digitOn;
			digitOn += offset;
			total += digitOn;
			offset += 2;
		}
		System.out.println(total);
	}

}
