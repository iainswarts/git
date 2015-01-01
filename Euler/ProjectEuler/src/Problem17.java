public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for (int i = 0; i <= 1000; i++) {
			total+=numberToString(i);
		}
		System.out.println(total);
	}

	public static int numberToString(int n) {

		int length = 0;

		int[] hundreds = { 0, 10, 10, 12, 11, 11, 10, 12, 12, 11 };
		
		length = (n / 1000 == 1) ? 11 : 0;
		length += hundreds[(n%1000) / 100];

		int[] tens = { 0, 0, 6, 6, 5, 5, 5, 7, 6, 6 };

		int[] ands = { 0, 3, 3, 5, 4, 4, 3, 5, 5, 4 };

		if (n % 100 != 0 && length != 0)
			length += 3;
		
		if(n % 100 <= 19){
			switch (n%100) {
			case 0:
				break;
			case 1:
				length+=3;
				break;
			case 2:
				length+=3;
				break;
			case 3:
				length+=5;
				break;
			case 4:
				length+=4;
				break;
			case 5:
				length+=4;
				break;
			case 6:
				length+=3;
				break;
			case 7:
				length+=5;
				break;
			case 8:
				length+=5;
				break;
			case 9:
				length+=4;
				break;
			case 10:
				length+=3;
				break;
			case 11:
				length+=6;
				break;
			case 12:
				length+=6;
				break;
			case 13:
				length+=8;
				break;
			case 14:
				length+=8;
				break;
			case 15:
				length+=7;
				break;
			case 16:
				length+=7;
				break;
			case 17:
				length+=9;
				break;
			case 18:
				length+=8;
				break;
			case 19:
				length+=8;
				break;
			}
		} else{
			length+= tens[(n/10)%10] + ands[n%10];
		}
		return length;
		
		
	}
}
