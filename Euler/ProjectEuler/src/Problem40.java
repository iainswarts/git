public class Problem40 {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 0, 0, 0, 0, 0 };
		int d = 1;
		int count = 1;
		while (d < 10000001) {

			arr = check(d, count + "", arr);
			d += (count + "").length();
			count++;
			
		}
		int total=1;
		for (int i = 0; i < arr.length; i++) {
			total*=arr[i];
		}
		System.out.println(total);

	}

	public static int[] check(int n, String s, int[] arr) {
		// 1,10,100,1000,10000,100000,1000000
		// 0 1 2 3 4 5 6

		for (int i = 0; i < s.length(); i++) {
			switch (n) {
			case 1:
				arr[0] = Integer.parseInt(s.charAt(i) + "");
				break;
			case 10:
				arr[1] = Integer.parseInt(s.charAt(i) + "");
				break;
			case 100:
				arr[2] = Integer.parseInt(s.charAt(i) + "");
				break;
			case 1000:
				arr[3] = Integer.parseInt(s.charAt(i) + "");
				break;
			case 10000:
				arr[4] = Integer.parseInt(s.charAt(i) + "");
				break;
			case 100000:
				arr[5] = Integer.parseInt(s.charAt(i) + "");
				break;
			case 1000000:
				arr[6] = Integer.parseInt(s.charAt(i) + "");
				break;
			default:
				break;
			}
			n++;
		}

		return arr;

	}
}
