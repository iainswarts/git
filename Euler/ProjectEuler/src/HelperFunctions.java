import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HelperFunctions {

	public static ArrayList<Integer> factorise(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				al.add(i);
				n = n / i;
			} else {
				i++;
			}
		}

		return al;
	}

	public static ArrayList<Integer> factoriseDistinct(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				if (!al.contains(i))
					al.add(i);
				n = n / i;
			} else {
				i++;
			}
		}

		return al;
	}

	public static boolean isPrime(long n) {
		if (n <= 3) {
			return n > 1;
		} else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		} else {
			for (int i = 5; i * i <= n; i += 6) {
				if (n % i == 0 || n % (i + 2) == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public long factorial(long n) {
		if (n <= 1) {
			return 1;
		}

		return factorial(n - 1) * n;

	}

	public boolean stringMultBy2(String inputName, String outputName)
			throws FileNotFoundException {
		Scanner sc = new Scanner(new File(inputName));
		PrintWriter pw = new PrintWriter(new File(outputName));

		int carry = 0;

		String data = sc.nextLine();
		sc.close();
		for (int i = 0; i < data.length(); i++) {
			int result = Integer.parseInt(data.charAt(i) + "") * 2 + carry;
			pw.append((result % 10 + ""));
			carry = result / 10;
		}
		if (carry != 0)
			pw.append(carry + "");
		pw.close();
		return true;
	}

	public static boolean stringMult(String inputName, String outputName, int mult)
			throws FileNotFoundException {
		Scanner sc = new Scanner(new File(inputName));
		PrintWriter pw = new PrintWriter(new File(outputName));

		int carry = 0;

		String data = sc.nextLine();
		sc.close();
		for (int i = 0; i < data.length(); i++) {
			int result = Integer.parseInt(data.charAt(i) + "") * mult + carry;
			pw.append((result % 10 + ""));
			carry = result / 10;
		}
		if (carry != 0)
			pw.append(reverseString(carry + ""));
		pw.close();
		return true;
	}

	public static String reverseString(String s) {
		char[] cArr = s.toCharArray();
		for (int i = 0; i < cArr.length / 2; i++) {
			char temp = cArr[i];
			cArr[i] = cArr[cArr.length - 1 - i];
			cArr[cArr.length - i - 1] = temp;
		}
		String r = "";
		for (int i = 0; i < cArr.length; i++) {
			r = r.concat(cArr[i] + "");
		}
		return r;
	}

	public static ArrayList<Integer> getFactors(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 2;
		while (n > i) {
			if (n % i == 0 && !al.contains(i)) {
				al.add(i);
				i++;
			} else {
				i++;
			}
		}
		al.add(1);
		return al;
	}

	@SuppressWarnings("rawtypes")
	public static void mergeSort(Comparable[] a) {
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp, 0, a.length - 1);
	}

	@SuppressWarnings("rawtypes")
	private static void mergeSort(Comparable[] a, Comparable[] tmp, int left,
			int right) {
		if (left < right) {
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void merge(Comparable[] a, Comparable[] tmp, int left,
			int right, int rightEnd) {
		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;

		while (left <= leftEnd && right <= rightEnd)
			if (a[left].compareTo(a[right]) <= 0)
				tmp[k++] = a[left++];
			else
				tmp[k++] = a[right++];

		while (left <= leftEnd)
			// Copy rest of first half
			tmp[k++] = a[left++];

		while (right <= rightEnd)
			// Copy rest of right half
			tmp[k++] = a[right++];

		// Copy tmp back
		for (int i = 0; i < num; i++, rightEnd--)
			a[rightEnd] = tmp[rightEnd];
	}

	public static boolean stringAdd(String d1, String d2, String outputName)
			throws FileNotFoundException {
		Scanner sc = new Scanner(new File(d1));
		PrintWriter pw = new PrintWriter(new File(outputName));

		int carry = 0;

		String s1 = sc.nextLine();
		sc.close();
		sc = new Scanner(new File(d2));
		String s2 = sc.nextLine();
		sc.close();

		for (int i = 0; i < ((s1.length() > s2.length()) ? s1.length() : s2
				.length()); i++) {
			int d1i = 0;
			int d2i = 0;

			if (i < s1.length())
				d1i = Integer.parseInt(s1.charAt(i) + "");
			if (i < s2.length())
				d2i = Integer.parseInt(s2.charAt(i) + "");

			int result = d1i + d2i + carry;
			pw.append((result % 10 + ""));
			carry = result / 10;
		}
		if (carry != 0)
			pw.append(reverseString(carry + ""));
		pw.close();
		return true;
	}

	public boolean isPalindrome(String s) {
		return s.equals(reverseString(s));
	}

	public String decimalToBin(int n) {
		String s = "";
		while (n > 0) {
			s = (n % 2 == 1) ? '1' + s : '0' + s;
			n = n / 2;
		}
		return s;
	}

	public static boolean isPand(String s) {
		int[] contained = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		for (int i = 0; i < s.length(); i++) {
			contained[Integer.parseInt(s.charAt(i) + "")] = 0;
		}

		for (int i = 0; i < s.length(); i++) {
			if (contained[i] != 0)
				return false;
		}
		return true;
	}

}
