package euler;

public class Problem5 {

	public static void main(String[] args) {
		
		//SMALLEST MULTIPLE	
		
		int n = 20;
		
		for(;;) {
			if(isDivisibleBy20(n)) {
				System.out.println(n);
				break;
			}
			n++;
		}
		
		
	}
	
	static boolean isDivisibleBy20(int n) {
		
		for(int i = 1; i <=20; i++) {
			if(n%i != 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
