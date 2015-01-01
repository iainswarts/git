import java.util.ArrayList;

public class Problem24 {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelperFunctions hf = new HelperFunctions();

		ArrayList<Integer> listOfUnused = new ArrayList<Integer>() {
			{
				add(0);
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
				add(6);
				add(7);
				add(8);
				add(9);
			}
		};

		String output = "";
		
		int n = 1000000;
		int x = 10;
		n--;
		
		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);
		
		
		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);
		
		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);

		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);

		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);

		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);

		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);

		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);

		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);

		output += "" + listOfUnused.get((int) (n/hf.factorial((x-1))));
		listOfUnused.remove((int) (n/hf.factorial((x-1))));
		n = n%((int)hf.factorial(x-1));
		x--;
		System.out.println(output);
		
	}

}
