import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Problem13.txt"));
		
		int[][] data = new int[100][50];
		int[] carry = new int [50];
		int[] answer = new int[50];
		
		for (int i = 0; i < data.length; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < data[0].length; j++) {
				data[i][49-j] = Integer.parseInt(line.charAt(49 - j) + "" );
			}
		}
		
		for (int i = 0; i < carry.length; i++) {
			if (i != 0)
				carry[49-i] = carry[50-i]/10; 
			for (int j = 0; j < 100; j++) {
				carry[49-i] += data[j][49-i];
			}
			answer[49-i] = carry[49-i]%10 ;
		}
		String answerS = "";
		String carryS = carry[0]/10 + "";
		for (int i = 0; i < 10; i++) {
			answerS += answer[i] + "";
		}
		System.out.println("Answer :" + answerS + "\nCarry :" + carryS);
		
		sc.close();
		
		
	}
}
