import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem42 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Integer> listOfTriangles = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			listOfTriangles.add((i * (i + 1)) / 2);
		}

		Scanner sc = new Scanner(new File("words.txt")).useDelimiter(",");
		int total = 0;
		while (sc.hasNext()) {
			String s = sc.next();
			total = listOfTriangles.contains(getScore(s)) ? total+1
					: total;
		}
		System.out.println(total);
	}

	public static int getScore(String s) {
		int score = 0;
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '\"')
				score += s.charAt(i) - (int) 'a' + 1;
		}

		return score;
	}

}
