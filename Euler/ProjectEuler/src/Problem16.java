import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) throws FileNotFoundException {
//		HelperFunctions hf = new HelperFunctions();
//		for (int i = 0; i < 1000; i++) {
//			String input = "StringMult/" + i + ".txt";
//			String ouput = "StringMult/" + (i + 1) + ".txt";
//			hf.stringMultBy2(input, ouput);
//		}
		
		Scanner sc = new Scanner(new File("StringMult/1000.txt"));
		
		String data = sc.next();
		int total = 0;
		for (int i = 0; i < data.length(); i++) {
			total+=(Integer.parseInt(data.charAt(i)+""));
		}
		System.out.println(total);
		sc.close();
	}
}
