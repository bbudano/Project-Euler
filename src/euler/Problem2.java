package euler;

public class Problem2 {

	public static void main(String[] args) {

		// EVEN FIBONACCI NUMBERS
		// By considering the terms in the Fibonacci sequence whose values do not exceed
		// four million,
		// find the sum of the even-valued terms.

		int term = 1;
		int previous1 = 0;
		int previous2 = 0;
		int evenSum = 0;

		while (term <= 4000000) {
			if (term % 2 == 0) {
				evenSum += term;
			}

			previous2 = previous1;
			previous1 = term;
			term = previous1 + previous2;

		}
		
		System.out.println(evenSum);

	}

}
