
public class Problem12 {

	public static void main(String[] args) {
		
		boolean flag = true;
		long NumberBeingTested = 3;
		long triangleNumber = 2;
		while (flag){
			NumberBeingTested = 0;
			for(int j = 1; j <= triangleNumber;j++){
				NumberBeingTested +=j;
			}
			
			
			int numFactors = 1;
			long i = NumberBeingTested /2;
			
			while(i > 0){
				if(NumberBeingTested % i == 0)
				{
					numFactors++;
				}
				i--;
			}
			
			if(numFactors > 500){
				flag = false;
			}
			else
			{
				triangleNumber++;
			}
			System.out.println(NumberBeingTested + " - " + numFactors);
			
			
		}
			System.out.println(triangleNumber);
	}

}
