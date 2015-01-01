import java.util.ArrayList;

public class Problem46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10000;
		ArrayList<Integer> oddComposite = populateOddComposite(max);
		ArrayList<Integer> oddCompositeCopy = populateOddComposite(max);
		ArrayList<Integer> prime = populatePrime(max);
		
		String listOfViolators = "";
		loop1:
		for (Integer oddInt : oddComposite) {
			
			for (Integer primeInt : prime) {
				//System.out.println(oddInt + " - " + primeInt);
				if(primeInt > oddInt)
					break;
				
				for(int i = 0;2*i*i<oddInt;i++)
				{
					if(2*i*i+primeInt == oddInt)
					{
						oddCompositeCopy.remove((Object)oddInt);
						continue loop1;
					}
				}
				
				
			}
			System.out.println(oddInt);
			
		}
		System.out.println(oddCompositeCopy);
		
	}

	private static ArrayList<Integer> populatePrime(int max) {
		ArrayList<Integer> prime = new ArrayList<Integer>();
		for (int i = 2; i < max; i++) {
			if (HelperFunctions.isPrime(i))
				prime.add(i);

		}

		return prime;
	}

	public static ArrayList<Integer> populateOddComposite(int max) {

		ArrayList<Integer> oddComposite = new ArrayList<Integer>();
		for (int i = 1; i < max; i = i + 2) {
			if (!HelperFunctions.isPrime(i))
				oddComposite.add(i);

		}

		return oddComposite;
	}

}
