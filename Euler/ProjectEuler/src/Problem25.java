import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int length = 0;
		int f1 = 1;
		int f2 = 2;
		Scanner sc;
		HelperFunctions hf = new HelperFunctions();
		while (length < 1000) {

			hf.stringAdd("Fibonacci/" + f1 + ".txt",
					"Fibonacci/" + f2 + ".txt", "Fibonacci/" + (f2 + 1)
							+ ".txt");
			f1++;
			f2++;
			length = (new Scanner(new File("Fibonacci/" + f2 + ".txt")))
					.nextLine().length();
			System.out.println(f2 + " - " + length);
		}

		System.out.println(f2);

	}

}
