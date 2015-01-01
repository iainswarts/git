import java.util.ArrayList;


public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> abundant= getAbundant();
		long nonAbundant = 0;
		for (int i = 1; i < 28123; i++) {
			System.out.println(i);
			boolean flag = true;
			for (Integer j : abundant) {
				if(j>i)
					break;
				if(abundant.contains(i-j)){
					flag = false;
					break;
				}
			}
			nonAbundant = flag? nonAbundant+i : nonAbundant;
		}
		System.out.println(nonAbundant);
		
	}
	
	public static ArrayList<Integer> getAbundant()
	{
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i < 28123; i++) {
			if(sumOfFactors(i) > i)
				list.add(i);
		}
		
		
		
		return list;
	}
	
	public static int sumOfFactors(int n){
		HelperFunctions hf = new HelperFunctions();
		ArrayList<Integer> list = hf.getFactors(n);
		int sum = 0;
		for (Integer i : list) {
			sum+=i;
		}
		
		return sum;
	}

}
