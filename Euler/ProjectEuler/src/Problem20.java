import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem20 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		HelperFunctions hf = new HelperFunctions();
		for (int i = 1; i < 100; i++) {
			String input = "BigFact/" + i + ".txt";
			String ouput = "BigFact/" + (i + 1) + ".txt";
			hf.stringMult(input, ouput, (i+1));
			System.out.println(i);
		}

		Scanner sc = new Scanner(new File("BigFact/100.txt"));

		String data = sc.next();
		int total = 0;
		for (int i = 0; i < data.length(); i++) {
			total += (Integer.parseInt(data.charAt(i) + ""));
		}
		System.out.println(total);
		sc.close();
	}

}
