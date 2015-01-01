public class Problem39 {

	public static void main(String[] args) {

		int maxP = 0;
		int maxN = 0;

		for (int s = 0; s < 1000; s++) {
			int N = 0;
			for (int a = 0; a < s; a++) {
				for (int b = 0; b < s; b++) {
					int c = s-a-b;
					if(c*c == a*a+b*b)
						N++;
					
					
					
				}
			}
			if(N>maxN){
				maxN = N;
				maxP =s;
			}
			System.out.println(s);
		}
System.out.println(maxP);
	}
}
