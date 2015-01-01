import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem48 {

	public static void main(String[] args) throws FileNotFoundException {

//		for (int i = 1; i <= 1000; i++) {
//
//			PrintWriter pw = new PrintWriter(new File("SelfPowers/" + i + "-"
//					+ "1.txt"));
//			pw.write(HelperFunctions.reverseString(i + ""));
//			pw.close();
//			System.out.println(i);
//			for (int j = 1; j < i; j++) {
//
//				Scanner sc = new Scanner(new File("SelfPowers/" + i + "-" + j
//						+ ".txt"));
//				String s = sc.nextLine();
//				sc.close();
//				if (s.length() > 10)
//					s = s.substring(0, 10);
//				pw = new PrintWriter(new File("SelfPowers/" + i + "-" + j
//						+ ".txt"));
//				pw.write(s);
//				pw.close();
//
//				String in = "SelfPowers/" + i + "-" + j + ".txt";
//				String out = "SelfPowers/" + i + "-" + (j + 1) + ".txt";
//
//				HelperFunctions.stringMult(in, out, i);
//
//			}
//
//		}

		for (int i = 2; i <= 1000; i++) {

			String in = "SelfPowers/" + i + "-" + i + ".txt";
			String in2 = "SelfPowerTemp/" + (i-1) + ".txt";
			String out = "SelfPowerTemp/" + i+".txt";
			HelperFunctions.stringAdd(in, in2, out);
		}

	}
}
