import java.util.ArrayList;

import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

public class Problem45 {

	private static ArrayList<Long> penta = new ArrayList<Long>();
	private static ArrayList<Long> triangle = new ArrayList<Long>();
	private static ArrayList<Long> hexa = new ArrayList<Long>();

	public static void main(String[] args) {

		for (long i = 1; i < 500000; i++) {
			System.out.println(i);
			hexa.add(i * (2 * i - 1));

			long p = (i * (3 * i - 1) / 2);
			if (hexa.contains(p))
				penta.add(p);
			//else
				//continue;
			
			long t = (i * i + i) / 2;
			if (penta.contains(t))
				triangle.add(t);
			

		}
		System.out.println(triangle.get(0));
		System.out.println(triangle.get(1));
		System.out.println(triangle.get(2));
		/*
		 * System.out.println(triangle.get(9998)); int count = 0; for(int i
		 * =0;i<triangle.get(9998);i++){ if(isPenta(i)&&isHexa(i)&&isTri(i))
		 * count++; System.out.println(i);
		 * 
		 * if(count ==3) break; }
		 */
	}

	public static boolean isPenta(int n) {
		return penta.contains(n);
	}

	public static boolean isHexa(int n) {
		return hexa.contains(n);
	}

	public static boolean isTri(int n) {
		return triangle.contains(n);
	}
}
