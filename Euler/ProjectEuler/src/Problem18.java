import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Problem18.txt"));
		int lineCount = 0;

		while (sc.hasNextLine()) {
			sc.nextLine();
			lineCount++;
		}
		sc.close();
		int[][] data = new int[lineCount][lineCount];
		sc = new Scanner(new File("Problem18.txt"));

		for (int i = 0; i < data.length; i++) {
			int j = 0;

			while (j != (i + 1)) {
				data[i][j++] = sc.nextInt();
			}

		}

		for (int i = data.length - 2; i >= 0; i--) {
			for (int j = 0; j < data[0].length-2; j++) {
				data[i][j] = (data[i+1][j] > data[i+1][j+1]) ? data[i][j] + data[i+1][j] : data[i][j] + data[i+1][j+1];
			}
		}

		System.out.println(data[0][0]);

	}

}
