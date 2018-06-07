package euler;

public class Problem1 {

	public static void main(String[] args) {

		// MULTIPLES OF 3 AND 5
		// Find the sum of all the multiples of 3 or 5 below 1000

		int sum = 0;

		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);

	}

}
