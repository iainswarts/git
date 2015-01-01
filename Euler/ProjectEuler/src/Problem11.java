import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Problem11.txt"));
		int[][] data = new int[20][20];
		int max = 0;
		int test = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < data.length; j++) {
				if (i >= 3) {
					test = data[i][j] * data[i-1][j] * data[i-2][j] *data[i-3][j];
					max = (test > max) ? test : max;
				}
				
				if( i >=3 && j>=3){
					test = data[i][j] * data[i-1][j-1] * data[i-2][j-2] *data[i-3][j-3];
					max = (test > max) ? test : max;
				}
				
				if (j >= 3) {
					test = data[i][j] * data[i][j-1] * data[i][j-2] *data[i][j-3];
					max = (test > max) ? test : max;
				}
				
				if( i >=3 && j<17){
					test = data[i][j] * data[i-1][j+1] * data[i-2][j+2] *data[i-3][j+3];
					max = (test > max) ? test : max;
				}
			}
			
		}
		System.out.println(max);
	}

}
