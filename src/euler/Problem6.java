package euler;

public class Problem6 {

	public static void main(String[] args) {

		// SUM SQUARE DIFFERENCE
		// Find the difference between the sum of the squares of the first one 100
		// natural numbers and the square of the sum

		int sumOfSquares = 0;
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sumOfSquares += (i * i);
			sum += i;
		}
		
		System.out.println((sum*sum) - sumOfSquares);

	}

}
