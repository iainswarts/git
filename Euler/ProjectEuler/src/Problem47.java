
public class Problem47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HelperFunctions.factoriseDistinct(644).size());
		int consecutive = 0;
		int i = 2;
		while(consecutive!=4){
			if(HelperFunctions.factoriseDistinct(i).size()!=4){
				consecutive=0;
			} else {
				System.out.println(i);
				consecutive++;
			}
			i++;
		}
		
	}

}
