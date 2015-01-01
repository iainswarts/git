public class Problem14 {

	public static void main(String[] args) {
		int maxLength = 0;
		int startingNum = 0;
		for (int i = 1; i < 1000000; i++) {
			long num = i;
			int chainSize = 0;
			while (num != 1) {
				num = Collatz(num);
				chainSize++;
			}
			if(chainSize > maxLength){
				maxLength = chainSize;
				startingNum = i;
			}
			System.out.println(i);
		}
		System.out.println(startingNum);
	}

	public static long Collatz(long n) {
		return (n % 2 == 0) ? n / 2 : 3 * n + 1;

	}
}
