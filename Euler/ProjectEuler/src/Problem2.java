public class Problem2 {
	public static void main(String[] args) {
		int total = 0, f1 = 1, f2 = 2;

		while(f2 < 4000000){
			total = (f2 % 2 == 0) ? total+=f2 : total;
			int temp = f2;
			f2 = f1 + f2;
			f1 = temp;
		}
		System.out.println(total);
	}
}
