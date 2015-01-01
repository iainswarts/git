import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("p022_names.txt")).useDelimiter(",");
	
		int count = 0;
		while (sc.hasNext()){
			count++;
			sc.next();
		}
		sc.close();
		String[] arr = new String[count];
		sc = new Scanner(new File("p022_names.txt")).useDelimiter(",");
		
		long total = 0;
		for (int i = 0; i < count; i++) {
			arr[i] = sc.next();
		}
		HelperFunctions.mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			total+= getNameScore(arr[i])*(i+1);
		}
		
		System.out.println(total);
		
		
	}
	

	public static int getNameScore(String name) {
		int score = 0;
		name = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)!='"')
				score += (int) name.charAt(i) - 96;
		}

		return score;
	}


}
