package euler;

public class Problem7 {

	public static void main(String[] args) {
		
		//10001st PRIME
		//What is the 10 001st prime number?
		int br = 0;
		int n = 2;
		for(;;) {
			if(isPrime(n)) {
				br++;
			}
			if(br == 10001) {
				System.out.println(n);
				break;
			}
			n++;
		}
		
		
	}
	
	static boolean isPrime(int n) {
		
		for(int i = 2; i < n; i++) {
			
			if(n % i == 0) {
				return false;
			}
			
		}
		
		return true;
	}
	
}
