public class Problem50 {

	public final static int MAX_PRIME_VALUE = 1000000;

	public static void main(String[] args) {

		// i will be the starting point of the chain
		int maxChainLength = 1;
		int maxChainPrime = 1;

		for (int i = 2; i < MAX_PRIME_VALUE; i++) {
			int currentChainLength = 0;
			int currentTotal = 0;
			int currentNum = i;

			if (HelperFunctions.isPrime(i)) {
				while (currentNum + currentTotal < MAX_PRIME_VALUE) {
					System.out.println(i + " - " + currentNum);
					if (HelperFunctions.isPrime(currentNum)) {
						currentTotal += currentNum;
						currentNum++;
						currentChainLength++;

						if (currentChainLength > maxChainLength
								&& HelperFunctions.isPrime(currentTotal)) {
							maxChainLength = currentChainLength;
							maxChainPrime = currentTotal;
						}

					} else {
						currentNum++;
					}

				}
			}

		}
System.out.println(maxChainLength + " - " + maxChainPrime);
	}

	private static int getConsecutivePrimes(int n) {

		int maxLength = 1;

		// decides the starting number for the chain
		for (int i = 2; i < n; i++) {
			int total = 0;
			int count = i;
			int length = 0;
			while (total < n) {
				if (HelperFunctions.isPrime(count)) {
					total += count;
					count++;
					length++;
				} else {
					count++;
				}

			}
			if (total == n)
				maxLength = (length > maxLength) ? length : maxLength;

		}
		return maxLength;
	}

}
